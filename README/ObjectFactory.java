//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.23 a las 11:39:41 AM CST 
//


package com.xml.pokemon;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xml.pokemon package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xml.pokemon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pokemon }
     * 
     */
    public Pokemon createPokemon() {
        return new Pokemon();
    }

    /**
     * Create an instance of {@link Pokemon.Held_items }
     * 
     */
    public Pokemon.Held_items createPokemonHeld_Items() {
        return new Pokemon.Held_items();
    }

    /**
     * Create an instance of {@link Pokemon.Held_items.Version_details }
     * 
     */
    public Pokemon.Held_items.Version_details createPokemonHeld_ItemsVersion_details() {
        return new Pokemon.Held_items.Version_details();
    }

    /**
     * Create an instance of {@link Pokemon.Abilities }
     * 
     */
    public Pokemon.Abilities createPokemonAbilities() {
        return new Pokemon.Abilities();
    }

    /**
     * Create an instance of {@link PokemonRequest }
     * 
     */
    public PokemonRequest createPokemonRequest() {
        return new PokemonRequest();
    }

    /**
     * Create an instance of {@link PokemonResponse }
     * 
     */
    public PokemonResponse createPokemonResponse() {
        return new PokemonResponse();
    }

    /**
     * Create an instance of {@link Pokemon.Held_items.Item }
     * 
     */
    public Pokemon.Held_items.Item createPokemonHeld_ItemsItem() {
        return new Pokemon.Held_items.Item();
    }

    /**
     * Create an instance of {@link Pokemon.Held_items.Version_details.Version }
     * 
     */
    public Pokemon.Held_items.Version_details.Version createPokemonHeld_itemsVersion_detailsVersion() {
        return new Pokemon.Held_items.Version_details.Version();
    }

    /**
     * Create an instance of {@link Pokemon.Abilities.Ability }
     * 
     */
    public Pokemon.Abilities.Ability createPokemonAbilitiesAbility() {
        return new Pokemon.Abilities.Ability();
    }

}
