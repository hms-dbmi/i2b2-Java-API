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
 * <p>Java class for pdoRequest_typeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pdoRequest_typeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="getPDO_fromInputList"/>
 *     &lt;enumeration value="get_observationfact_by_primary_key"/>
 *     &lt;enumeration value="get_patient_by_primary_key"/>
 *     &lt;enumeration value="get_event_by_primary_key"/>
 *     &lt;enumeration value="get_concept_by_primary_key"/>
 *     &lt;enumeration value="get_observer_by_primary_key"/>
 *     &lt;enumeration value="get_pdo_template"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pdoRequest_typeType")
@XmlEnum
public enum PdoRequestTypeType {


    /**
     * [getquerydef]
     * 
     */
    @XmlEnumValue("getPDO_fromInputList")
    GET_PDO_FROM_INPUT_LIST("getPDO_fromInputList"),

    /**
     * [getquerydef]
     * 
     */
    @XmlEnumValue("get_observationfact_by_primary_key")
    GET_OBSERVATIONFACT_BY_PRIMARY_KEY("get_observationfact_by_primary_key"),

    /**
     * [getquerydef]
     * 
     */
    @XmlEnumValue("get_patient_by_primary_key")
    GET_PATIENT_BY_PRIMARY_KEY("get_patient_by_primary_key"),

    /**
     * [getquerydef]
     * 
     */
    @XmlEnumValue("get_event_by_primary_key")
    GET_EVENT_BY_PRIMARY_KEY("get_event_by_primary_key"),

    /**
     * [getquerydef]
     * 
     */
    @XmlEnumValue("get_concept_by_primary_key")
    GET_CONCEPT_BY_PRIMARY_KEY("get_concept_by_primary_key"),

    /**
     * [getquerydef]
     * 
     */
    @XmlEnumValue("get_observer_by_primary_key")
    GET_OBSERVER_BY_PRIMARY_KEY("get_observer_by_primary_key"),
    @XmlEnumValue("get_pdo_template")
    GET_PDO_TEMPLATE("get_pdo_template");
    private final String value;

    PdoRequestTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PdoRequestTypeType fromValue(String v) {
        for (PdoRequestTypeType c: PdoRequestTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
