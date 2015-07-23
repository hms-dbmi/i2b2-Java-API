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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for patient_set_collectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patient_set_collectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patient_set_coll_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}patient_set_coll_idType"/>
 *         &lt;element name="result_instance_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}result_instance_idType"/>
 *         &lt;element name="set_index" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}set_indexType"/>
 *         &lt;element name="patient_id" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}patient_numType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patient_set_collectionType", propOrder = {
    "patientSetCollId",
    "resultInstanceId",
    "setIndex",
    "patientId"
})
public class PatientSetCollectionType {

    @XmlElement(name = "patient_set_coll_id", required = true)
    protected String patientSetCollId;
    @XmlElement(name = "result_instance_id", required = true)
    protected String resultInstanceId;
    @XmlElement(name = "set_index")
    protected int setIndex;
    @XmlElement(name = "patient_id", required = true)
    protected String patientId;

    /**
     * Gets the value of the patientSetCollId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientSetCollId() {
        return patientSetCollId;
    }

    /**
     * Sets the value of the patientSetCollId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientSetCollId(String value) {
        this.patientSetCollId = value;
    }

    /**
     * Gets the value of the resultInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultInstanceId() {
        return resultInstanceId;
    }

    /**
     * Sets the value of the resultInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultInstanceId(String value) {
        this.resultInstanceId = value;
    }

    /**
     * Gets the value of the setIndex property.
     * 
     */
    public int getSetIndex() {
        return setIndex;
    }

    /**
     * Sets the value of the setIndex property.
     * 
     */
    public void setSetIndex(int value) {
        this.setIndex = value;
    }

    /**
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientId(String value) {
        this.patientId = value;
    }

}
