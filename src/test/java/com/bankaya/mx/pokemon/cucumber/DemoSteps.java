package com.bankaya.mx.pokemon.cucumber;


import com.bankaya.mx.pokemon.controller.PokemonController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@SpringBootTest
public class DemoSteps {

    private MockMvc mockMvc;

    @Autowired
    private PokemonController pokemonController;

    @Given("servicio pokemon disponible")
    public void servicio_pokemon_disponible() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(pokemonController).build();
    }

    @When("obtener pokemon {string} y metodo {string}")
    public void obtener_pokemon_nombre_y_metodo(String name, String method) throws Exception {
        mockMvc.perform(get("/pokemon")
                        .queryParam("name", name)
                        .queryParam("method", method))
                .andExpect(status().isOk());
    }

    @Then("deberia recibir un codigo de estado {int}")
    public void deberia_recibir_un_codigo_de_estado(int statusCode) throws Exception {
        mockMvc.perform(get("/pokemon")
                        .queryParam("name", "ditto")
                        .queryParam("method", "abilities"))
                .andExpect(status().is(statusCode));
    }

    @Then("respuesta contiene {string}")
    public void respuesta_contiene(String expectedContent) throws Exception {
        mockMvc.perform(get("/pokemon")
                        .queryParam("name", "ditto")
                        .queryParam("method", "base_experience"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString(expectedContent)));
    }
}