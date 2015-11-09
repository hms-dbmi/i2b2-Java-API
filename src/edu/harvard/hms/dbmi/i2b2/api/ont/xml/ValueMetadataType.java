/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.ont.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for value_metadata_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="value_metadata_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MaxStringLength" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Flagstouse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Oktousevalues" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LowofLowValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HighofLowValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LowofHighValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HighofHighValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LowofToxicValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HighofToxicValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EnumValues">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Val" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="ExcludingVal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CommentsDetermingExclusion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Com" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnitValues">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NormalUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="EqualUnits" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="ExcludingUnits" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="ConvertingUnits" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MultiplyingFactor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "value_metadata_Type", propOrder = {
    "version",
    "creationDateTime",
    "maxStringLength",
    "dataType",
    "flagstouse",
    "oktousevalues",
    "lowofLowValue",
    "highofLowValue",
    "lowofHighValue",
    "highofHighValue",
    "lowofToxicValue",
    "highofToxicValue",
    "enumValues",
    "commentsDetermingExclusion",
    "unitValues"
})
public class ValueMetadataType {

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "MaxStringLength", required = true)
    protected String maxStringLength;
    @XmlElement(name = "DataType", required = true)
    protected String dataType;
    @XmlElement(name = "Flagstouse", required = true)
    protected String flagstouse;
    @XmlElement(name = "Oktousevalues", required = true)
    protected String oktousevalues;
    @XmlElement(name = "LowofLowValue", required = true)
    protected String lowofLowValue;
    @XmlElement(name = "HighofLowValue", required = true)
    protected String highofLowValue;
    @XmlElement(name = "LowofHighValue", required = true)
    protected String lowofHighValue;
    @XmlElement(name = "HighofHighValue", required = true)
    protected String highofHighValue;
    @XmlElement(name = "LowofToxicValue", required = true)
    protected String lowofToxicValue;
    @XmlElement(name = "HighofToxicValue", required = true)
    protected String highofToxicValue;
    @XmlElement(name = "EnumValues", required = true)
    protected ValueMetadataType.EnumValues enumValues;
    @XmlElement(name = "CommentsDetermingExclusion", required = true)
    protected ValueMetadataType.CommentsDetermingExclusion commentsDetermingExclusion;
    @XmlElement(name = "UnitValues", required = true)
    protected ValueMetadataType.UnitValues unitValues;

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
     * Gets the value of the maxStringLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxStringLength() {
        return maxStringLength;
    }

    /**
     * Sets the value of the maxStringLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxStringLength(String value) {
        this.maxStringLength = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the flagstouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagstouse() {
        return flagstouse;
    }

    /**
     * Sets the value of the flagstouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagstouse(String value) {
        this.flagstouse = value;
    }

    /**
     * Gets the value of the oktousevalues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOktousevalues() {
        return oktousevalues;
    }

    /**
     * Sets the value of the oktousevalues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOktousevalues(String value) {
        this.oktousevalues = value;
    }

    /**
     * Gets the value of the lowofLowValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowofLowValue() {
        return lowofLowValue;
    }

    /**
     * Sets the value of the lowofLowValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowofLowValue(String value) {
        this.lowofLowValue = value;
    }

    /**
     * Gets the value of the highofLowValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighofLowValue() {
        return highofLowValue;
    }

    /**
     * Sets the value of the highofLowValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighofLowValue(String value) {
        this.highofLowValue = value;
    }

    /**
     * Gets the value of the lowofHighValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowofHighValue() {
        return lowofHighValue;
    }

    /**
     * Sets the value of the lowofHighValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowofHighValue(String value) {
        this.lowofHighValue = value;
    }

    /**
     * Gets the value of the highofHighValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighofHighValue() {
        return highofHighValue;
    }

    /**
     * Sets the value of the highofHighValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighofHighValue(String value) {
        this.highofHighValue = value;
    }

    /**
     * Gets the value of the lowofToxicValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowofToxicValue() {
        return lowofToxicValue;
    }

    /**
     * Sets the value of the lowofToxicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowofToxicValue(String value) {
        this.lowofToxicValue = value;
    }

    /**
     * Gets the value of the highofToxicValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighofToxicValue() {
        return highofToxicValue;
    }

    /**
     * Sets the value of the highofToxicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighofToxicValue(String value) {
        this.highofToxicValue = value;
    }

    /**
     * Gets the value of the enumValues property.
     * 
     * @return
     *     possible object is
     *     {@link ValueMetadataType.EnumValues }
     *     
     */
    public ValueMetadataType.EnumValues getEnumValues() {
        return enumValues;
    }

    /**
     * Sets the value of the enumValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueMetadataType.EnumValues }
     *     
     */
    public void setEnumValues(ValueMetadataType.EnumValues value) {
        this.enumValues = value;
    }

    /**
     * Gets the value of the commentsDetermingExclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ValueMetadataType.CommentsDetermingExclusion }
     *     
     */
    public ValueMetadataType.CommentsDetermingExclusion getCommentsDetermingExclusion() {
        return commentsDetermingExclusion;
    }

    /**
     * Sets the value of the commentsDetermingExclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueMetadataType.CommentsDetermingExclusion }
     *     
     */
    public void setCommentsDetermingExclusion(ValueMetadataType.CommentsDetermingExclusion value) {
        this.commentsDetermingExclusion = value;
    }

    /**
     * Gets the value of the unitValues property.
     * 
     * @return
     *     possible object is
     *     {@link ValueMetadataType.UnitValues }
     *     
     */
    public ValueMetadataType.UnitValues getUnitValues() {
        return unitValues;
    }

    /**
     * Sets the value of the unitValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueMetadataType.UnitValues }
     *     
     */
    public void setUnitValues(ValueMetadataType.UnitValues value) {
        this.unitValues = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Com" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "com"
    })
    public static class CommentsDetermingExclusion {

        @XmlElement(name = "Com", required = true)
        protected List<String> com;

        /**
         * Gets the value of the com property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the com property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCom().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCom() {
            if (com == null) {
                com = new ArrayList<String>();
            }
            return this.com;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Val" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="ExcludingVal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "val",
        "excludingVal"
    })
    public static class EnumValues {

        @XmlElement(name = "Val", required = true)
        protected List<String> val;
        @XmlElement(name = "ExcludingVal", required = true)
        protected List<String> excludingVal;

        /**
         * Gets the value of the val property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the val property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVal() {
            if (val == null) {
                val = new ArrayList<String>();
            }
            return this.val;
        }

        /**
         * Gets the value of the excludingVal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludingVal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludingVal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExcludingVal() {
            if (excludingVal == null) {
                excludingVal = new ArrayList<String>();
            }
            return this.excludingVal;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NormalUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="EqualUnits" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="ExcludingUnits" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="ConvertingUnits" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MultiplyingFactor" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "normalUnits",
        "equalUnits",
        "excludingUnits",
        "convertingUnits"
    })
    public static class UnitValues {

        @XmlElement(name = "NormalUnits", required = true)
        protected String normalUnits;
        @XmlElement(name = "EqualUnits", required = true)
        protected List<String> equalUnits;
        @XmlElement(name = "ExcludingUnits", required = true)
        protected List<String> excludingUnits;
        @XmlElement(name = "ConvertingUnits", required = true)
        protected List<ValueMetadataType.UnitValues.ConvertingUnits> convertingUnits;

        /**
         * Gets the value of the normalUnits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNormalUnits() {
            return normalUnits;
        }

        /**
         * Sets the value of the normalUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNormalUnits(String value) {
            this.normalUnits = value;
        }

        /**
         * Gets the value of the equalUnits property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the equalUnits property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEqualUnits().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEqualUnits() {
            if (equalUnits == null) {
                equalUnits = new ArrayList<String>();
            }
            return this.equalUnits;
        }

        /**
         * Gets the value of the excludingUnits property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludingUnits property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludingUnits().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExcludingUnits() {
            if (excludingUnits == null) {
                excludingUnits = new ArrayList<String>();
            }
            return this.excludingUnits;
        }

        /**
         * Gets the value of the convertingUnits property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the convertingUnits property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConvertingUnits().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValueMetadataType.UnitValues.ConvertingUnits }
         * 
         * 
         */
        public List<ValueMetadataType.UnitValues.ConvertingUnits> getConvertingUnits() {
            if (convertingUnits == null) {
                convertingUnits = new ArrayList<ValueMetadataType.UnitValues.ConvertingUnits>();
            }
            return this.convertingUnits;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Units" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MultiplyingFactor" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "units",
            "multiplyingFactor"
        })
        public static class ConvertingUnits {

            @XmlElement(name = "Units", required = true)
            protected String units;
            @XmlElement(name = "MultiplyingFactor")
            protected float multiplyingFactor;

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnits() {
                return units;
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnits(String value) {
                this.units = value;
            }

            /**
             * Gets the value of the multiplyingFactor property.
             * 
             */
            public float getMultiplyingFactor() {
                return multiplyingFactor;
            }

            /**
             * Sets the value of the multiplyingFactor property.
             * 
             */
            public void setMultiplyingFactor(float value) {
                this.multiplyingFactor = value;
            }

        }

    }

}
