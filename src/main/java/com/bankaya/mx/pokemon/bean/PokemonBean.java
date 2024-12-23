package com.bankaya.mx.pokemon.bean;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class PokemonBean {

    private List<Abilities> abilities;

    private Integer base_experience;

    private List held_items;

    private Integer id;

    private String name;

    private String location_area_encounters;

    @Data
    public static class Abilities {

        private Ability ability;

        private String is_hidden;

        private String slot;

    }

    @Data
    public static class Ability {
        private String name;

        private String url;
    }
}
