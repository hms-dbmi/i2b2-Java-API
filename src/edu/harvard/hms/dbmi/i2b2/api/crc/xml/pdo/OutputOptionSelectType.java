/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputOptionSelectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outputOptionSelectType">
 *   &lt;restriction base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}tokenType">
 *     &lt;enumeration value="using_input_list"/>
 *     &lt;enumeration value="using_filter_list"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outputOptionSelectType")
@XmlEnum
public enum OutputOptionSelectType {


    /**
     * Using input liste
     * 
     */
    @XmlEnumValue("using_input_list")
    USING_INPUT_LIST("using_input_list"),

    /**
     * Using filter list
     * 
     */
    @XmlEnumValue("using_filter_list")
    USING_FILTER_LIST("using_filter_list");
    private final String value;

    OutputOptionSelectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputOptionSelectType fromValue(String v) {
        for (OutputOptionSelectType c: OutputOptionSelectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
