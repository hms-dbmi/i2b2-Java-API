/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for load_data_responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="load_data_responseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}responseType">
 *       &lt;sequence>
 *         &lt;element name="upload_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data_file_location_uri">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="protocol_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="load_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transformer_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observation_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}set_statusType" minOccurs="0"/>
 *         &lt;element name="patient_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}set_statusType" minOccurs="0"/>
 *         &lt;element name="event_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}set_statusType" minOccurs="0"/>
 *         &lt;element name="observer_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}set_statusType" minOccurs="0"/>
 *         &lt;element name="concept_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}set_statusType" minOccurs="0"/>
 *         &lt;element name="pid_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}set_statusType" minOccurs="0"/>
 *         &lt;element name="eventid_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}set_statusType" minOccurs="0"/>
 *         &lt;element name="modifier_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}set_statusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "load_data_responseType", propOrder = {
    "uploadId",
    "userId",
    "dataFileLocationUri",
    "loadStatus",
    "transformerName",
    "startDate",
    "endDate",
    "message",
    "observationSet",
    "patientSet",
    "eventSet",
    "observerSet",
    "conceptSet",
    "pidSet",
    "eventidSet",
    "modifierSet"
})
public class LoadDataResponseType
    extends ResponseType
{

    @XmlElement(name = "upload_id", required = true)
    protected String uploadId;
    @XmlElement(name = "user_id", required = true)
    protected String userId;
    @XmlElement(name = "data_file_location_uri", required = true)
    protected LoadDataResponseType.DataFileLocationUri dataFileLocationUri;
    @XmlElement(name = "load_status", required = true)
    protected String loadStatus;
    @XmlElement(name = "transformer_name", required = true)
    protected String transformerName;
    @XmlElement(name = "start_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "end_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(name = "observation_set")
    protected SetStatusType observationSet;
    @XmlElement(name = "patient_set")
    protected SetStatusType patientSet;
    @XmlElement(name = "event_set")
    protected SetStatusType eventSet;
    @XmlElement(name = "observer_set")
    protected SetStatusType observerSet;
    @XmlElement(name = "concept_set")
    protected SetStatusType conceptSet;
    @XmlElement(name = "pid_set")
    protected SetStatusType pidSet;
    @XmlElement(name = "eventid_set")
    protected SetStatusType eventidSet;
    @XmlElement(name = "modifier_set")
    protected SetStatusType modifierSet;

    /**
     * Gets the value of the uploadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the value of the uploadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadId(String value) {
        this.uploadId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the dataFileLocationUri property.
     * 
     * @return
     *     possible object is
     *     {@link LoadDataResponseType.DataFileLocationUri }
     *     
     */
    public LoadDataResponseType.DataFileLocationUri getDataFileLocationUri() {
        return dataFileLocationUri;
    }

    /**
     * Sets the value of the dataFileLocationUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadDataResponseType.DataFileLocationUri }
     *     
     */
    public void setDataFileLocationUri(LoadDataResponseType.DataFileLocationUri value) {
        this.dataFileLocationUri = value;
    }

    /**
     * Gets the value of the loadStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadStatus() {
        return loadStatus;
    }

    /**
     * Sets the value of the loadStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadStatus(String value) {
        this.loadStatus = value;
    }

    /**
     * Gets the value of the transformerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerName() {
        return transformerName;
    }

    /**
     * Sets the value of the transformerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerName(String value) {
        this.transformerName = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the observationSet property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusType }
     *     
     */
    public SetStatusType getObservationSet() {
        return observationSet;
    }

    /**
     * Sets the value of the observationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusType }
     *     
     */
    public void setObservationSet(SetStatusType value) {
        this.observationSet = value;
    }

    /**
     * Gets the value of the patientSet property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusType }
     *     
     */
    public SetStatusType getPatientSet() {
        return patientSet;
    }

    /**
     * Sets the value of the patientSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusType }
     *     
     */
    public void setPatientSet(SetStatusType value) {
        this.patientSet = value;
    }

    /**
     * Gets the value of the eventSet property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusType }
     *     
     */
    public SetStatusType getEventSet() {
        return eventSet;
    }

    /**
     * Sets the value of the eventSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusType }
     *     
     */
    public void setEventSet(SetStatusType value) {
        this.eventSet = value;
    }

    /**
     * Gets the value of the observerSet property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusType }
     *     
     */
    public SetStatusType getObserverSet() {
        return observerSet;
    }

    /**
     * Sets the value of the observerSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusType }
     *     
     */
    public void setObserverSet(SetStatusType value) {
        this.observerSet = value;
    }

    /**
     * Gets the value of the conceptSet property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusType }
     *     
     */
    public SetStatusType getConceptSet() {
        return conceptSet;
    }

    /**
     * Sets the value of the conceptSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusType }
     *     
     */
    public void setConceptSet(SetStatusType value) {
        this.conceptSet = value;
    }

    /**
     * Gets the value of the pidSet property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusType }
     *     
     */
    public SetStatusType getPidSet() {
        return pidSet;
    }

    /**
     * Sets the value of the pidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusType }
     *     
     */
    public void setPidSet(SetStatusType value) {
        this.pidSet = value;
    }

    /**
     * Gets the value of the eventidSet property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusType }
     *     
     */
    public SetStatusType getEventidSet() {
        return eventidSet;
    }

    /**
     * Sets the value of the eventidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusType }
     *     
     */
    public void setEventidSet(SetStatusType value) {
        this.eventidSet = value;
    }

    /**
     * Gets the value of the modifierSet property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusType }
     *     
     */
    public SetStatusType getModifierSet() {
        return modifierSet;
    }

    /**
     * Sets the value of the modifierSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusType }
     *     
     */
    public void setModifierSet(SetStatusType value) {
        this.modifierSet = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="protocol_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class DataFileLocationUri {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "protocol_name")
        protected String protocolName;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the protocolName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolName() {
            return protocolName;
        }

        /**
         * Sets the value of the protocolName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolName(String value) {
            this.protocolName = value;
        }

    }

}
