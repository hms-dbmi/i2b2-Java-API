/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputOptionNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outputOptionNameType">
 *   &lt;restriction base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}tokenType">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="asattributes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outputOptionNameType")
@XmlEnum
public enum OutputOptionNameType {


    /**
     * Intags
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * As attributes
     * 
     */
    @XmlEnumValue("asattributes")
    ASATTRIBUTES("asattributes");
    private final String value;

    OutputOptionNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputOptionNameType fromValue(String v) {
        for (OutputOptionNameType c: OutputOptionNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
