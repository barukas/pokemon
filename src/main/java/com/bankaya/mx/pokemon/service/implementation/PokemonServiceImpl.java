package com.bankaya.mx.pokemon.service.implementation;

import com.bankaya.mx.pokemon.bean.PokemonBean;
import com.bankaya.mx.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonServiceImpl implements PokemonService {

    private final RestTemplate restTemplate;

    @Value("${domain.url}")
    private String domainURL;

    public PokemonServiceImpl() {
        this.restTemplate = new RestTemplate();
    }

    public ResponseEntity<Object> getPokemonMethodByName(final String name, final String method) {
        PokemonBean pokemonBean = this.restTemplate.getForObject(this.domainURL.concat(name), PokemonBean.class);

        return switch(method) {
            case "abilities" -> new ResponseEntity<Object>(pokemonBean.getAbilities(), HttpStatus.OK);
            case "base_experience" -> new ResponseEntity<Object>(pokemonBean.getBase_experience(), HttpStatus.OK);
            case "held_items" -> new ResponseEntity<Object>(pokemonBean.getHeld_items(), HttpStatus.OK);
            case "id" -> new ResponseEntity<Object>(pokemonBean.getId(), HttpStatus.OK);
            case "name" -> new ResponseEntity<Object>(pokemonBean.getName(), HttpStatus.OK);
            case "location_area_encounters" -> new ResponseEntity<Object>(pokemonBean.getLocation_area_encounters(), HttpStatus.OK);

            default -> new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
        };
    }
}
