/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
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
