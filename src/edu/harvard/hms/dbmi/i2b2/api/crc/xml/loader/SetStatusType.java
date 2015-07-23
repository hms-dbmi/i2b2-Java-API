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

package edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for set_statusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="set_statusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ignored_patient_data_file_uri">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="protocol_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="inserted_patient_data_file_uri">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="protocol_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inserted_record" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ignored_record" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="total_record" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "set_statusType", propOrder = {
    "ignoredPatientDataFileUri",
    "insertedPatientDataFileUri",
    "message"
})
public class SetStatusType {

    @XmlElement(name = "ignored_patient_data_file_uri", required = true)
    protected SetStatusType.IgnoredPatientDataFileUri ignoredPatientDataFileUri;
    @XmlElement(name = "inserted_patient_data_file_uri", required = true)
    protected SetStatusType.InsertedPatientDataFileUri insertedPatientDataFileUri;
    @XmlElement(required = true)
    protected String message;
    @XmlAttribute(name = "inserted_record")
    protected Integer insertedRecord;
    @XmlAttribute(name = "ignored_record")
    protected Integer ignoredRecord;
    @XmlAttribute(name = "total_record")
    protected Integer totalRecord;

    /**
     * Gets the value of the ignoredPatientDataFileUri property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusType.IgnoredPatientDataFileUri }
     *     
     */
    public SetStatusType.IgnoredPatientDataFileUri getIgnoredPatientDataFileUri() {
        return ignoredPatientDataFileUri;
    }

    /**
     * Sets the value of the ignoredPatientDataFileUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusType.IgnoredPatientDataFileUri }
     *     
     */
    public void setIgnoredPatientDataFileUri(SetStatusType.IgnoredPatientDataFileUri value) {
        this.ignoredPatientDataFileUri = value;
    }

    /**
     * Gets the value of the insertedPatientDataFileUri property.
     * 
     * @return
     *     possible object is
     *     {@link SetStatusType.InsertedPatientDataFileUri }
     *     
     */
    public SetStatusType.InsertedPatientDataFileUri getInsertedPatientDataFileUri() {
        return insertedPatientDataFileUri;
    }

    /**
     * Sets the value of the insertedPatientDataFileUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStatusType.InsertedPatientDataFileUri }
     *     
     */
    public void setInsertedPatientDataFileUri(SetStatusType.InsertedPatientDataFileUri value) {
        this.insertedPatientDataFileUri = value;
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
     * Gets the value of the insertedRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsertedRecord() {
        return insertedRecord;
    }

    /**
     * Sets the value of the insertedRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsertedRecord(Integer value) {
        this.insertedRecord = value;
    }

    /**
     * Gets the value of the ignoredRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIgnoredRecord() {
        return ignoredRecord;
    }

    /**
     * Sets the value of the ignoredRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIgnoredRecord(Integer value) {
        this.ignoredRecord = value;
    }

    /**
     * Gets the value of the totalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    /**
     * Sets the value of the totalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRecord(Integer value) {
        this.totalRecord = value;
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
    public static class IgnoredPatientDataFileUri {

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
    public static class InsertedPatientDataFileUri {

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
