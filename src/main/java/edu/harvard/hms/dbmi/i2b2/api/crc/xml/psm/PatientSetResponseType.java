/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patient_set_responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patient_set_responseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}responseType">
 *       &lt;sequence>
 *         &lt;element name="patient_set" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}patient_setType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patient_set_responseType", propOrder = {
    "patientSet"
})
public class PatientSetResponseType
    extends ResponseType
{

    @XmlElement(name = "patient_set", required = true)
    protected PatientSetType patientSet;

    /**
     * Gets the value of the patientSet property.
     * 
     * @return
     *     possible object is
     *     {@link PatientSetType }
     *     
     */
    public PatientSetType getPatientSet() {
        return patientSet;
    }

    /**
     * Sets the value of the patientSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientSetType }
     *     
     */
    public void setPatientSet(PatientSetType value) {
        this.patientSet = value;
    }

}
