/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.ont.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for genomicMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genomicMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SequenceVariantLocation" type="{http://www.i2b2.org/xsd/cell/ont/1.1/}sequenceVariantLocationType"/>
 *         &lt;element name="ChromosomeLocation" type="{http://www.i2b2.org/xsd/cell/ont/1.1/}chromosomeLocationType"/>
 *         &lt;element name="SequenceVariant" type="{http://www.i2b2.org/xsd/cell/ont/1.1/}sequenceVariantType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genomicMetadataType", propOrder = {
    "version",
    "creationDateTime",
    "sequenceVariantLocation",
    "chromosomeLocation",
    "sequenceVariant"
})
public class GenomicMetadataType {

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "SequenceVariantLocation", required = true)
    protected SequenceVariantLocationType sequenceVariantLocation;
    @XmlElement(name = "ChromosomeLocation", required = true)
    protected ChromosomeLocationType chromosomeLocation;
    @XmlElement(name = "SequenceVariant", required = true)
    protected SequenceVariantType sequenceVariant;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the sequenceVariantLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceVariantLocationType }
     *     
     */
    public SequenceVariantLocationType getSequenceVariantLocation() {
        return sequenceVariantLocation;
    }

    /**
     * Sets the value of the sequenceVariantLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceVariantLocationType }
     *     
     */
    public void setSequenceVariantLocation(SequenceVariantLocationType value) {
        this.sequenceVariantLocation = value;
    }

    /**
     * Gets the value of the chromosomeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ChromosomeLocationType }
     *     
     */
    public ChromosomeLocationType getChromosomeLocation() {
        return chromosomeLocation;
    }

    /**
     * Sets the value of the chromosomeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChromosomeLocationType }
     *     
     */
    public void setChromosomeLocation(ChromosomeLocationType value) {
        this.chromosomeLocation = value;
    }

    /**
     * Gets the value of the sequenceVariant property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceVariantType }
     *     
     */
    public SequenceVariantType getSequenceVariant() {
        return sequenceVariant;
    }

    /**
     * Sets the value of the sequenceVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceVariantType }
     *     
     */
    public void setSequenceVariant(SequenceVariantType value) {
        this.sequenceVariant = value;
    }

}
