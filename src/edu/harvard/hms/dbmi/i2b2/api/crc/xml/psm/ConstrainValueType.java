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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for constrainValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="constrainValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="LARGETEXT"/>
 *     &lt;enumeration value="FLAG"/>
 *     &lt;enumeration value="MODIFIER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "constrainValueType", namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/")
@XmlEnum
public enum ConstrainValueType {

    NUMBER,
    TEXT,
    LARGETEXT,
    FLAG,
    MODIFIER;

    public String value() {
        return name();
    }

    public static ConstrainValueType fromValue(String v) {
        return valueOf(v);
    }

}
