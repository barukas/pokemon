package com.bankaya.mx.pokemon.endpoint;

import com.bankaya.mx.pokemon.bean.Log;
import com.bankaya.mx.pokemon.service.implementation.LogServiceImpl;

import com.xml.pokemon.Pokemon;
import com.xml.pokemon.PokemonRequest;
import com.xml.pokemon.PokemonResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Date;

@Endpoint
public class PokemonEndpoint {

    private static final String NAMESPACE_URI = "http://www.xml.com/pokemon";

    private static final String POKEMON_REQUEST = "PokemonRequest";

    private final RestTemplate restTemplate;

    public PokemonEndpoint() {
        this.restTemplate = new RestTemplate();
    }

    private HttpServletRequest httpServletRequest;

    @Autowired
    private LogServiceImpl logService;

    @Autowired
    public void setRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @Value("${domain.url}")
    private String domainURL;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = PokemonEndpoint.POKEMON_REQUEST)
    @ResponsePayload
    public PokemonResponse getPokemon(@RequestPayload PokemonRequest pokemonRequest) {
        long startTime = System.currentTimeMillis();
        String ipClient = this.httpServletRequest.getRemoteAddr();

        PokemonResponse pokemonResponse = new PokemonResponse();

        if (pokemonRequest.getMethod() != null) {
            Pokemon pokemon  = this.restTemplate.getForObject(this.domainURL.concat(pokemonRequest.getName()), Pokemon.class);
            pokemonResponse.setPokemon(pokemon);
        }
        long endTime = System.currentTimeMillis() - startTime;
        this.logService.save(this.createLog(ipClient, pokemonRequest.getMethod().value(), endTime));
        return pokemonResponse;
    }

    private Log createLog(final String ip, final String method, final Long endTime) {
        Log log = new Log();
        log.setIp(ip);
        log.setRequestDate(new Date());
        log.setMethod(method);
        log.setExecutionTime(endTime);

        return log;
    }
}
