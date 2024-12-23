package com.bankaya.mx.pokemon.controller;

import com.bankaya.mx.pokemon.service.implementation.PokemonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokemonController {

    @Autowired
    private PokemonServiceImpl pokemonServiceImpl;

    @GetMapping("/pokemon")
    public ResponseEntity<Object> getPokemon(@RequestParam(value = "name") String name, @RequestParam(value = "method") String method) {
        return this.pokemonServiceImpl.getPokemonMethodByName(name, method);
    }
}
