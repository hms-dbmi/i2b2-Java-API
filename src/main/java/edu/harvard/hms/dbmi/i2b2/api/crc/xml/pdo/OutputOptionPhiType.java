/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputOptionPhiType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outputOptionPhiType">
 *   &lt;restriction base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}tokenType">
 *     &lt;enumeration value="encrypted"/>
 *     &lt;enumeration value="unencrypted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outputOptionPhiType")
@XmlEnum
public enum OutputOptionPhiType {


    /**
     * Encrypted
     * 
     */
    @XmlEnumValue("encrypted")
    ENCRYPTED("encrypted"),

    /**
     * Unencrypted
     * 
     */
    @XmlEnumValue("unencrypted")
    UNENCRYPTED("unencrypted");
    private final String value;

    OutputOptionPhiType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputOptionPhiType fromValue(String v) {
        for (OutputOptionPhiType c: OutputOptionPhiType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
