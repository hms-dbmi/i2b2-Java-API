/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPatientByPrimaryKey_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPatientByPrimaryKey_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}requestType">
 *       &lt;sequence>
 *         &lt;element name="patient_primary_key" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}patient_primary_key_Type"/>
 *         &lt;element name="patient_output_option" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPatientByPrimaryKey_requestType", propOrder = {
    "patientPrimaryKey",
    "patientOutputOption"
})
public class GetPatientByPrimaryKeyRequestType
    extends RequestType
{

    @XmlElement(name = "patient_primary_key", required = true)
    protected PatientPrimaryKeyType patientPrimaryKey;
    @XmlElement(name = "patient_output_option", required = true)
    protected OutputOptionType patientOutputOption;

    /**
     * Gets the value of the patientPrimaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link PatientPrimaryKeyType }
     *     
     */
    public PatientPrimaryKeyType getPatientPrimaryKey() {
        return patientPrimaryKey;
    }

    /**
     * Sets the value of the patientPrimaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientPrimaryKeyType }
     *     
     */
    public void setPatientPrimaryKey(PatientPrimaryKeyType value) {
        this.patientPrimaryKey = value;
    }

    /**
     * Gets the value of the patientOutputOption property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getPatientOutputOption() {
        return patientOutputOption;
    }

    /**
     * Sets the value of the patientOutputOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setPatientOutputOption(OutputOptionType value) {
        this.patientOutputOption = value;
    }

}
