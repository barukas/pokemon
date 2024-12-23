//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0
// Visite https://eclipse-ee4j.github.io/jaxb-ri
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen.
// Generado el: 2024.12.23 a las 11:39:41 AM CST
//


package com.xml.pokemon;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Pokemon complex type.
 *
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="Pokemon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abilities" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ability"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="base_experience" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="held_items" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="version_details" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                               &lt;element name="version"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="location_area_encounters" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pokemon", propOrder = {
    "abilities",
    "base_experience",
    "held_items",
    "id",
    "name",
    "location_area_encounters"
})
public class Pokemon {

    protected List<Pokemon.Abilities> abilities;
    @XmlElement(name = "base_experience")
    protected int base_experience;
    @XmlElement(name = "held_items")
    protected List<Pokemon.Held_items> held_items;
    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "location_area_encounters", required = true)
    protected String location_area_encounters;

    /**
     * Gets the value of the abilities property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the abilities property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbilities().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pokemon.Abilities }
     *
     *
     */
    public List<Pokemon.Abilities> getAbilities() {
        if (abilities == null) {
            abilities = new ArrayList<Pokemon.Abilities>();
        }
        return this.abilities;
    }

    /**
     * Obtiene el valor de la propiedad base_Experience.
     *
     */
    public int getBase_Experience() {
        return base_experience;
    }

    /**
     * Define el valor de la propiedad base_Experience.
     *
     */
    public void setBase_experience(int value) {
        this.base_experience = value;
    }

    /**
     * Gets the value of the heldItems property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the heldItems property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeld_Items().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pokemon.Held_Items }
     *
     *
     */
    public List<Pokemon.Held_items> getHeld_items() {
        if (held_items == null) {
            held_items = new ArrayList<Pokemon.Held_items>();
        }
        return this.held_items;
    }

    /**
     * Obtiene el valor de la propiedad id.
     *
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     *
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad location_Area_Encounters.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    /**
     * Define el valor de la propiedad location_Area_Encounters.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocation_area_encounters(String value) {
        this.location_area_encounters = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ability"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ability"
    })
    public static class Abilities {

        @XmlElement(required = true)
        protected Pokemon.Abilities.Ability ability;

        /**
         * Obtiene el valor de la propiedad ability.
         *
         * @return
         *     possible object is
         *     {@link Pokemon.Abilities.Ability }
         *
         */
        public Pokemon.Abilities.Ability getAbility() {
            return ability;
        }

        /**
         * Define el valor de la propiedad ability.
         *
         * @param value
         *     allowed object is
         *     {@link Pokemon.Abilities.Ability }
         *
         */
        public void setAbility(Pokemon.Abilities.Ability value) {
            this.ability = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "url"
        })
        public static class Ability {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String url;

            /**
             * Obtiene el valor de la propiedad name.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad url.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUrl() {
                return url;
            }

            /**
             * Define el valor de la propiedad url.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUrl(String value) {
                this.url = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="version_details" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                     &lt;element name="version"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                               &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item",
        "version_details"
    })
    public static class Held_items {

        @XmlElement(required = true)
        protected Pokemon.Held_items.Item item;
        @XmlElement(name = "version_details")
        protected List<Pokemon.Held_items.Version_details> version_details;

        /**
         * Obtiene el valor de la propiedad item.
         *
         * @return
         *     possible object is
         *     {@link Pokemon.Held_items.Item }
         *
         */
        public Pokemon.Held_items.Item getItem() {
            return item;
        }

        /**
         * Define el valor de la propiedad item.
         *
         * @param value
         *     allowed object is
         *     {@link Pokemon.Held_items.Item }
         *
         */
        public void setItem(Pokemon.Held_items.Item value) {
            this.item = value;
        }

        /**
         * Gets the value of the versionDetails property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the versionDetails property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVersion_Details().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Pokemon.Held_items.Version_details }
         *
         *
         */
        public List<Pokemon.Held_items.Version_details> getVersion_details() {
            if (version_details == null) {
                version_details = new ArrayList<Pokemon.Held_items.Version_details>();
            }
            return this.version_details;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "url"
        })
        public static class Item {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected String url;

            /**
             * Obtiene el valor de la propiedad name.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad url.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUrl() {
                return url;
            }

            /**
             * Define el valor de la propiedad url.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUrl(String value) {
                this.url = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;sequence&gt;
         *           &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *           &lt;element name="version"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                     &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *         &lt;/sequence&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "rarity",
            "version"
        })
        public static class Version_details {

            @XmlElement(required = true)
            protected String rarity;
            @XmlElement(required = true)
            protected Pokemon.Held_items.Version_details.Version version;

            /**
             * Obtiene el valor de la propiedad rarity.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRarity() {
                return rarity;
            }

            /**
             * Define el valor de la propiedad rarity.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRarity(String value) {
                this.rarity = value;
            }

            /**
             * Obtiene el valor de la propiedad version.
             *
             * @return
             *     possible object is
             *     {@link Pokemon.Held_items.Version_details.Version }
             *
             */
            public Pokemon.Held_items.Version_details.Version getVersion() {
                return version;
            }

            /**
             * Define el valor de la propiedad version.
             *
             * @param value
             *     allowed object is
             *     {@link Pokemon.Held_items.Version_details.Version }
             *
             */
            public void setVersion(Pokemon.Held_items.Version_details.Version value) {
                this.version = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "url"
            })
            public static class Version {

                @XmlElement(required = true)
                protected String name;
                @XmlElement(required = true)
                protected String url;

                /**
                 * Obtiene el valor de la propiedad name.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Obtiene el valor de la propiedad url.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getUrl() {
                    return url;
                }

                /**
                 * Define el valor de la propiedad url.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setUrl(String value) {
                    this.url = value;
                }

            }

        }

    }

}
