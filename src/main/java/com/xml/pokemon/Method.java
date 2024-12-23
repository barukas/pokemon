//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.23 a las 11:39:41 AM CST 
//


package com.xml.pokemon;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para method.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="method"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABILITIES"/&gt;
 *     &lt;enumeration value="BASE_EXPERIENCE"/&gt;
 *     &lt;enumeration value="HELD_ITEMS"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="NAME"/&gt;
 *     &lt;enumeration value="LOCATION_AREA_ENCOUNTERS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "method")
@XmlEnum
public enum Method {

    ABILITIES("ABILITIES"),
    @XmlEnumValue("BASE_EXPERIENCE")
    BASE___EXPERIENCE("BASE_EXPERIENCE"),
    @XmlEnumValue("HELD_ITEMS")
    HELD___ITEMS("HELD_ITEMS"),
    ID("ID"),
    NAME("NAME"),
    @XmlEnumValue("LOCATION_AREA_ENCOUNTERS")
    LOCATION___AREA___ENCOUNTERS("LOCATION_AREA_ENCOUNTERS");
    private final String value;

    Method(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Method fromValue(String v) {
        for (Method c: Method.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
