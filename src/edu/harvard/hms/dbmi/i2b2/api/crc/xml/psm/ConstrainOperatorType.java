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

package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for constrainOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="constrainOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="LE"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="LIKE"/>
 *     &lt;enumeration value="LIKE[begin]"/>
 *     &lt;enumeration value="LIKE[end]"/>
 *     &lt;enumeration value="LIKE[contains]"/>
 *     &lt;enumeration value="LIKE[exact]"/>
 *     &lt;enumeration value="BETWEEN"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="CONTAINS[database]"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "constrainOperatorType", namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/")
@XmlEnum
public enum ConstrainOperatorType {

    EQ("EQ"),
    NE("NE"),
    GT("GT"),
    LT("LT"),
    GE("GE"),
    LE("LE"),
    IN("IN"),
    LIKE("LIKE"),
    @XmlEnumValue("LIKE[begin]")
    LIKE_BEGIN("LIKE[begin]"),
    @XmlEnumValue("LIKE[end]")
    LIKE_END("LIKE[end]"),
    @XmlEnumValue("LIKE[contains]")
    LIKE_CONTAINS("LIKE[contains]"),
    @XmlEnumValue("LIKE[exact]")
    LIKE_EXACT("LIKE[exact]"),
    BETWEEN("BETWEEN"),
    CONTAINS("CONTAINS"),
    @XmlEnumValue("CONTAINS[database]")
    CONTAINS_DATABASE("CONTAINS[database]");
    private final String value;

    ConstrainOperatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstrainOperatorType fromValue(String v) {
        for (ConstrainOperatorType c: ConstrainOperatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
