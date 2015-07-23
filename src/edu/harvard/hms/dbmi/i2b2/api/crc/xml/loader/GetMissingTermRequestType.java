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


/**
 * <p>Java class for get_missing_term_request_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="get_missing_term_request_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="concept_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missingreport_optionType"/>
 *         &lt;element name="observer_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missingreport_optionType"/>
 *         &lt;element name="modifier_set" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}missingreport_optionType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="upload_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="detail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_missing_term_request_type", propOrder = {
    "conceptSet",
    "observerSet",
    "modifierSet"
})
public class GetMissingTermRequestType {

    @XmlElement(name = "concept_set", required = true)
    protected MissingreportOptionType conceptSet;
    @XmlElement(name = "observer_set", required = true)
    protected MissingreportOptionType observerSet;
    @XmlElement(name = "modifier_set", required = true)
    protected MissingreportOptionType modifierSet;
    @XmlAttribute(name = "upload_id")
    protected String uploadId;
    @XmlAttribute(name = "detail")
    protected Boolean detail;

    /**
     * Gets the value of the conceptSet property.
     * 
     * @return
     *     possible object is
     *     {@link MissingreportOptionType }
     *     
     */
    public MissingreportOptionType getConceptSet() {
        return conceptSet;
    }

    /**
     * Sets the value of the conceptSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingreportOptionType }
     *     
     */
    public void setConceptSet(MissingreportOptionType value) {
        this.conceptSet = value;
    }

    /**
     * Gets the value of the observerSet property.
     * 
     * @return
     *     possible object is
     *     {@link MissingreportOptionType }
     *     
     */
    public MissingreportOptionType getObserverSet() {
        return observerSet;
    }

    /**
     * Sets the value of the observerSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingreportOptionType }
     *     
     */
    public void setObserverSet(MissingreportOptionType value) {
        this.observerSet = value;
    }

    /**
     * Gets the value of the modifierSet property.
     * 
     * @return
     *     possible object is
     *     {@link MissingreportOptionType }
     *     
     */
    public MissingreportOptionType getModifierSet() {
        return modifierSet;
    }

    /**
     * Sets the value of the modifierSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingreportOptionType }
     *     
     */
    public void setModifierSet(MissingreportOptionType value) {
        this.modifierSet = value;
    }

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
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDetail() {
        if (detail == null) {
            return false;
        } else {
            return detail;
        }
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetail(Boolean value) {
        this.detail = value;
    }

}
