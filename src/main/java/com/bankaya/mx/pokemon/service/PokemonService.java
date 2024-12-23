package com.bankaya.mx.pokemon.service;

import org.springframework.http.ResponseEntity;

public interface PokemonService {

    public ResponseEntity<Object> getPokemonMethodByName(final String name, final String method);
}
