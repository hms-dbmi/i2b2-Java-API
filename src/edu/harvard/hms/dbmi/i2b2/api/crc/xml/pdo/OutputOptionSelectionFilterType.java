/*
 *  This file is part of i2b2-Java-API.
 *
 *  The i2b2-Java-API is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  i2b2-Java-API is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with i2b2-Java-API.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputOptionSelectionFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outputOptionSelectionFilterType">
 *   &lt;restriction base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}tokenType">
 *     &lt;enumeration value="min_value"/>
 *     &lt;enumeration value="max_value"/>
 *     &lt;enumeration value="first_value"/>
 *     &lt;enumeration value="last_value"/>
 *     &lt;enumeration value="single_observation"/>
 *     &lt;enumeration value="last_n_values"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outputOptionSelectionFilterType")
@XmlEnum
public enum OutputOptionSelectionFilterType {


    /**
     * minimum value
     * 
     */
    @XmlEnumValue("min_value")
    MIN_VALUE("min_value"),

    /**
     * maximum value
     * 
     */
    @XmlEnumValue("max_value")
    MAX_VALUE("max_value"),

    /**
     * first value
     * 
     */
    @XmlEnumValue("first_value")
    FIRST_VALUE("first_value"),

    /**
     * last value
     * 
     */
    @XmlEnumValue("last_value")
    LAST_VALUE("last_value"),

    /**
     * one item
     * 
     */
    @XmlEnumValue("single_observation")
    SINGLE_OBSERVATION("single_observation"),

    /**
     * last n values
     * 
     */
    @XmlEnumValue("last_n_values")
    LAST_N_VALUES("last_n_values");
    private final String value;

    OutputOptionSelectionFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputOptionSelectionFilterType fromValue(String v) {
        for (OutputOptionSelectionFilterType c: OutputOptionSelectionFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
