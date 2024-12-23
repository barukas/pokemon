package com.bankaya.mx.pokemon.cucumber;


import com.bankaya.mx.pokemon.SpringBootCucumberApplicationTests;
import io.cucumber.junit.platform.engine.Cucumber;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Cucumber
@SpringBootTest(classes = SpringBootCucumberApplicationTests.class)
public class PokemonControllerCucucmberTest {
}
