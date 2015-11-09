/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputOptionTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outputOptionTimeType">
 *   &lt;restriction base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}tokenType">
 *     &lt;enumeration value="nozone"/>
 *     &lt;enumeration value="withzone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outputOptionTimeType")
@XmlEnum
public enum OutputOptionTimeType {


    /**
     * No Zone
     * 
     */
    @XmlEnumValue("nozone")
    NOZONE("nozone"),

    /**
     * With Zone
     * 
     */
    @XmlEnumValue("withzone")
    WITHZONE("withzone");
    private final String value;

    OutputOptionTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputOptionTimeType fromValue(String v) {
        for (OutputOptionTimeType c: OutputOptionTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
