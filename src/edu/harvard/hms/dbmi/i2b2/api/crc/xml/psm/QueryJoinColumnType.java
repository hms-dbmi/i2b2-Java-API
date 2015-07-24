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
 * <p>Java class for queryJoinColumnType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="queryJoinColumnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PATIENT"/>
 *     &lt;enumeration value="ENCOUNTER"/>
 *     &lt;enumeration value="INSTANCE"/>
 *     &lt;enumeration value="STARTDATE"/>
 *     &lt;enumeration value="ENDDATE"/>
 *     &lt;enumeration value="ENCOUNTER_STARTDATE"/>
 *     &lt;enumeration value="ENCOUNTER_ENDDATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "queryJoinColumnType", namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/")
@XmlEnum
public enum QueryJoinColumnType {

    PATIENT,
    ENCOUNTER,
    INSTANCE,
    STARTDATE,
    ENDDATE,
    ENCOUNTER_STARTDATE,
    ENCOUNTER_ENDDATE;

    public String value() {
        return name();
    }

    public static QueryJoinColumnType fromValue(String v) {
        return valueOf(v);
    }

}