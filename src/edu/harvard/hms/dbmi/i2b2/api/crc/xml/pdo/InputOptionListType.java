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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for input_option_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="input_option_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="patient_list" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}patient_listType"/>
 *         &lt;element name="event_list" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}event_listType"/>
 *         &lt;element name="pid_list" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}pid_listType"/>
 *         &lt;element name="eid_list" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}eid_listType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "input_option_listType", propOrder = {
    "patientList",
    "eventList",
    "pidList",
    "eidList"
})
public class InputOptionListType {

    @XmlElement(name = "patient_list")
    protected PatientListType patientList;
    @XmlElement(name = "event_list")
    protected EventListType eventList;
    @XmlElement(name = "pid_list")
    protected PidListType pidList;
    @XmlElement(name = "eid_list")
    protected EidListType eidList;

    /**
     * Gets the value of the patientList property.
     * 
     * @return
     *     possible object is
     *     {@link PatientListType }
     *     
     */
    public PatientListType getPatientList() {
        return patientList;
    }

    /**
     * Sets the value of the patientList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientListType }
     *     
     */
    public void setPatientList(PatientListType value) {
        this.patientList = value;
    }

    /**
     * Gets the value of the eventList property.
     * 
     * @return
     *     possible object is
     *     {@link EventListType }
     *     
     */
    public EventListType getEventList() {
        return eventList;
    }

    /**
     * Sets the value of the eventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventListType }
     *     
     */
    public void setEventList(EventListType value) {
        this.eventList = value;
    }

    /**
     * Gets the value of the pidList property.
     * 
     * @return
     *     possible object is
     *     {@link PidListType }
     *     
     */
    public PidListType getPidList() {
        return pidList;
    }

    /**
     * Sets the value of the pidList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PidListType }
     *     
     */
    public void setPidList(PidListType value) {
        this.pidList = value;
    }

    /**
     * Gets the value of the eidList property.
     * 
     * @return
     *     possible object is
     *     {@link EidListType }
     *     
     */
    public EidListType getEidList() {
        return eidList;
    }

    /**
     * Sets the value of the eidList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EidListType }
     *     
     */
    public void setEidList(EidListType value) {
        this.eidList = value;
    }

}
