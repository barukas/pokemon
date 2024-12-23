package com.bankaya.mx.pokemon;

import com.xml.pokemon.Method;
import com.xml.pokemon.PokemonResponse;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.mock.web.MockHttpServletRequest;
import com.bankaya.mx.pokemon.bean.Log;
import com.bankaya.mx.pokemon.endpoint.PokemonEndpoint;
import com.bankaya.mx.pokemon.service.implementation.LogServiceImpl;
import com.xml.pokemon.Pokemon;
import com.xml.pokemon.PokemonRequest;
import org.junit.Test;

import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.Silent.class)
public class PokemonEndpointTest {

    private static final String IP_LOCAL = "127.0.0.1";

    @Mock
    private RestTemplate restTemplate;

    @Mock
    private MockHttpServletRequest mockHttpServletRequest;

    @Mock
    private LogServiceImpl logService;

    @InjectMocks
    private PokemonEndpoint pokemonEndpoint;

    @Mock
    private MockMvc mockMvc;

    @TestConfiguration
    static class PokemonEndpointTestConfig {
        @Bean
        public RestTemplate restTemplate() {
            return Mockito.mock(RestTemplate.class);
        }

        @Bean
        public MockHttpServletRequest mockHttpServletRequest() {
            return Mockito.mock(MockHttpServletRequest.class);
        }
    }

    /*@BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        this.pokemonEndpoint = new PokemonEndpoint();
        this.mockHttpServletRequest.setRemoteAddr(PokemonEndpointTest.IP_LOCAL);
        this.pokemonEndpoint.setRequest(mockHttpServletRequest);
    }*/

    @Test
    public void testGetPokemon() throws Exception {
        ReflectionTestUtils.setField(this.pokemonEndpoint, "domainURL", "https://pokeapi.co/api/v2/pokemon/");

        PokemonRequest pokemonRequest = new PokemonRequest();
        pokemonRequest.setName("pikachu");
        pokemonRequest.setMethod(Method.NAME);

        Pokemon mockPokemon = new Pokemon();
        mockPokemon.setName("pikachu");

        when(this.restTemplate.getForObject(anyString(), eq(Pokemon.class)))
                .thenReturn(mockPokemon);

        PokemonResponse response = pokemonEndpoint.getPokemon(pokemonRequest);

        assertNotNull(response);
        //assertEquals("pikachu", response.getPokemon().getName());
        verify(logService).save(any(Log.class));
    }
}
