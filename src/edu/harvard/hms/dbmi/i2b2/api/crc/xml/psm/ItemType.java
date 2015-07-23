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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hlevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_icon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tooltip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="constrain_by_value" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="value_operator" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainOperatorType"/>
 *                   &lt;element name="value_constraint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value_unit_of_measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value_type" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainValueType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="constrain_by_date" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date_from" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainDateType"/>
 *                   &lt;element name="date_to" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainDateType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="constrain_by_modifier">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modifier_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="modifier_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="applied_path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="constrain_by_value" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="value_operator" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainOperatorType"/>
 *                             &lt;element name="value_constraint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="value_unit_of_measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="value_type" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainValueType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dim_tablename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dim_columnname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dim_dimcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dim_columndatatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dim_operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="facttablecolumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="modifier_visualattributes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="modifier_synonym_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="modifier_tooltip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="modifier_class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dim_tablename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dim_columnname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dim_dimcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dim_columndatatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dim_operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="facttablecolumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_shape" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_row_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item_is_synonym" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="metadataxml" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}metadataxml_valueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", propOrder = {
    "hlevel",
    "itemName",
    "itemKey",
    "itemIcon",
    "tooltip",
    "clazz",
    "constrainByValue",
    "constrainByDate",
    "constrainByModifier",
    "dimTablename",
    "dimColumnname",
    "dimDimcode",
    "dimColumndatatype",
    "dimOperator",
    "facttablecolumn",
    "itemColor",
    "itemShape",
    "itemRowNumber",
    "itemIsSynonym",
    "metadataxml"
})
public class ItemType {

    protected int hlevel;
    @XmlElement(name = "item_name", required = true)
    protected String itemName;
    @XmlElement(name = "item_key", required = true)
    protected String itemKey;
    @XmlElement(name = "item_icon", required = true)
    protected String itemIcon;
    @XmlElement(required = true)
    protected String tooltip;
    @XmlElement(name = "class", required = true)
    protected String clazz;
    @XmlElement(name = "constrain_by_value")
    protected List<ItemType.ConstrainByValue> constrainByValue;
    @XmlElement(name = "constrain_by_date")
    protected List<ItemType.ConstrainByDate> constrainByDate;
    @XmlElement(name = "constrain_by_modifier", required = true)
    protected ItemType.ConstrainByModifier constrainByModifier;
    @XmlElement(name = "dim_tablename", required = true)
    protected String dimTablename;
    @XmlElement(name = "dim_columnname", required = true)
    protected String dimColumnname;
    @XmlElement(name = "dim_dimcode", required = true)
    protected String dimDimcode;
    @XmlElement(name = "dim_columndatatype", required = true)
    protected String dimColumndatatype;
    @XmlElement(name = "dim_operator", required = true)
    protected String dimOperator;
    @XmlElement(required = true)
    protected String facttablecolumn;
    @XmlElement(name = "item_color", required = true)
    protected String itemColor;
    @XmlElement(name = "item_shape", required = true)
    protected String itemShape;
    @XmlElement(name = "item_row_number", required = true)
    protected String itemRowNumber;
    @XmlElement(name = "item_is_synonym")
    protected boolean itemIsSynonym;
    @XmlElement(required = true)
    protected MetadataxmlValueType metadataxml;

    /**
     * Gets the value of the hlevel property.
     * 
     */
    public int getHlevel() {
        return hlevel;
    }

    /**
     * Sets the value of the hlevel property.
     * 
     */
    public void setHlevel(int value) {
        this.hlevel = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemKey() {
        return itemKey;
    }

    /**
     * Sets the value of the itemKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemKey(String value) {
        this.itemKey = value;
    }

    /**
     * Gets the value of the itemIcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemIcon() {
        return itemIcon;
    }

    /**
     * Sets the value of the itemIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemIcon(String value) {
        this.itemIcon = value;
    }

    /**
     * Gets the value of the tooltip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTooltip() {
        return tooltip;
    }

    /**
     * Sets the value of the tooltip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTooltip(String value) {
        this.tooltip = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the constrainByValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constrainByValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstrainByValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType.ConstrainByValue }
     * 
     * 
     */
    public List<ItemType.ConstrainByValue> getConstrainByValue() {
        if (constrainByValue == null) {
            constrainByValue = new ArrayList<ItemType.ConstrainByValue>();
        }
        return this.constrainByValue;
    }

    /**
     * Gets the value of the constrainByDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constrainByDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstrainByDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType.ConstrainByDate }
     * 
     * 
     */
    public List<ItemType.ConstrainByDate> getConstrainByDate() {
        if (constrainByDate == null) {
            constrainByDate = new ArrayList<ItemType.ConstrainByDate>();
        }
        return this.constrainByDate;
    }

    /**
     * Gets the value of the constrainByModifier property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType.ConstrainByModifier }
     *     
     */
    public ItemType.ConstrainByModifier getConstrainByModifier() {
        return constrainByModifier;
    }

    /**
     * Sets the value of the constrainByModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType.ConstrainByModifier }
     *     
     */
    public void setConstrainByModifier(ItemType.ConstrainByModifier value) {
        this.constrainByModifier = value;
    }

    /**
     * Gets the value of the dimTablename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimTablename() {
        return dimTablename;
    }

    /**
     * Sets the value of the dimTablename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimTablename(String value) {
        this.dimTablename = value;
    }

    /**
     * Gets the value of the dimColumnname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimColumnname() {
        return dimColumnname;
    }

    /**
     * Sets the value of the dimColumnname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimColumnname(String value) {
        this.dimColumnname = value;
    }

    /**
     * Gets the value of the dimDimcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimDimcode() {
        return dimDimcode;
    }

    /**
     * Sets the value of the dimDimcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimDimcode(String value) {
        this.dimDimcode = value;
    }

    /**
     * Gets the value of the dimColumndatatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimColumndatatype() {
        return dimColumndatatype;
    }

    /**
     * Sets the value of the dimColumndatatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimColumndatatype(String value) {
        this.dimColumndatatype = value;
    }

    /**
     * Gets the value of the dimOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimOperator() {
        return dimOperator;
    }

    /**
     * Sets the value of the dimOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimOperator(String value) {
        this.dimOperator = value;
    }

    /**
     * Gets the value of the facttablecolumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacttablecolumn() {
        return facttablecolumn;
    }

    /**
     * Sets the value of the facttablecolumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacttablecolumn(String value) {
        this.facttablecolumn = value;
    }

    /**
     * Gets the value of the itemColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemColor() {
        return itemColor;
    }

    /**
     * Sets the value of the itemColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemColor(String value) {
        this.itemColor = value;
    }

    /**
     * Gets the value of the itemShape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemShape() {
        return itemShape;
    }

    /**
     * Sets the value of the itemShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemShape(String value) {
        this.itemShape = value;
    }

    /**
     * Gets the value of the itemRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemRowNumber() {
        return itemRowNumber;
    }

    /**
     * Sets the value of the itemRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemRowNumber(String value) {
        this.itemRowNumber = value;
    }

    /**
     * Gets the value of the itemIsSynonym property.
     * 
     */
    public boolean isItemIsSynonym() {
        return itemIsSynonym;
    }

    /**
     * Sets the value of the itemIsSynonym property.
     * 
     */
    public void setItemIsSynonym(boolean value) {
        this.itemIsSynonym = value;
    }

    /**
     * Gets the value of the metadataxml property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataxmlValueType }
     *     
     */
    public MetadataxmlValueType getMetadataxml() {
        return metadataxml;
    }

    /**
     * Sets the value of the metadataxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataxmlValueType }
     *     
     */
    public void setMetadataxml(MetadataxmlValueType value) {
        this.metadataxml = value;
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
     *         &lt;element name="date_from" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainDateType"/>
     *         &lt;element name="date_to" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainDateType"/>
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
        "dateFrom",
        "dateTo"
    })
    public static class ConstrainByDate {

        @XmlElement(name = "date_from", required = true)
        protected ConstrainDateType dateFrom;
        @XmlElement(name = "date_to", required = true)
        protected ConstrainDateType dateTo;

        /**
         * Gets the value of the dateFrom property.
         * 
         * @return
         *     possible object is
         *     {@link ConstrainDateType }
         *     
         */
        public ConstrainDateType getDateFrom() {
            return dateFrom;
        }

        /**
         * Sets the value of the dateFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConstrainDateType }
         *     
         */
        public void setDateFrom(ConstrainDateType value) {
            this.dateFrom = value;
        }

        /**
         * Gets the value of the dateTo property.
         * 
         * @return
         *     possible object is
         *     {@link ConstrainDateType }
         *     
         */
        public ConstrainDateType getDateTo() {
            return dateTo;
        }

        /**
         * Sets the value of the dateTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConstrainDateType }
         *     
         */
        public void setDateTo(ConstrainDateType value) {
            this.dateTo = value;
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
     *         &lt;element name="modifier_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="modifier_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="applied_path" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="constrain_by_value" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="value_operator" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainOperatorType"/>
     *                   &lt;element name="value_constraint" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="value_unit_of_measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="value_type" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainValueType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dim_tablename" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dim_columnname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dim_dimcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dim_columndatatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dim_operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="facttablecolumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="modifier_visualattributes" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="modifier_synonym_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="modifier_tooltip" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="modifier_class" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "modifierName",
        "modifierKey",
        "appliedPath",
        "constrainByValue",
        "dimTablename",
        "dimColumnname",
        "dimDimcode",
        "dimColumndatatype",
        "dimOperator",
        "facttablecolumn",
        "modifierVisualattributes",
        "modifierSynonymCd",
        "modifierTooltip",
        "modifierClass"
    })
    public static class ConstrainByModifier {

        @XmlElement(name = "modifier_name", required = true)
        protected String modifierName;
        @XmlElement(name = "modifier_key", required = true)
        protected String modifierKey;
        @XmlElement(name = "applied_path", required = true)
        protected String appliedPath;
        @XmlElement(name = "constrain_by_value")
        protected List<ItemType.ConstrainByModifier.ConstrainByValue> constrainByValue;
        @XmlElement(name = "dim_tablename", required = true)
        protected String dimTablename;
        @XmlElement(name = "dim_columnname", required = true)
        protected String dimColumnname;
        @XmlElement(name = "dim_dimcode", required = true)
        protected String dimDimcode;
        @XmlElement(name = "dim_columndatatype", required = true)
        protected String dimColumndatatype;
        @XmlElement(name = "dim_operator", required = true)
        protected String dimOperator;
        @XmlElement(required = true)
        protected String facttablecolumn;
        @XmlElement(name = "modifier_visualattributes", required = true)
        protected String modifierVisualattributes;
        @XmlElement(name = "modifier_synonym_cd", required = true)
        protected String modifierSynonymCd;
        @XmlElement(name = "modifier_tooltip", required = true)
        protected String modifierTooltip;
        @XmlElement(name = "modifier_class", required = true)
        protected String modifierClass;

        /**
         * Gets the value of the modifierName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifierName() {
            return modifierName;
        }

        /**
         * Sets the value of the modifierName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifierName(String value) {
            this.modifierName = value;
        }

        /**
         * Gets the value of the modifierKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifierKey() {
            return modifierKey;
        }

        /**
         * Sets the value of the modifierKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifierKey(String value) {
            this.modifierKey = value;
        }

        /**
         * Gets the value of the appliedPath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppliedPath() {
            return appliedPath;
        }

        /**
         * Sets the value of the appliedPath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppliedPath(String value) {
            this.appliedPath = value;
        }

        /**
         * Gets the value of the constrainByValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constrainByValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConstrainByValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemType.ConstrainByModifier.ConstrainByValue }
         * 
         * 
         */
        public List<ItemType.ConstrainByModifier.ConstrainByValue> getConstrainByValue() {
            if (constrainByValue == null) {
                constrainByValue = new ArrayList<ItemType.ConstrainByModifier.ConstrainByValue>();
            }
            return this.constrainByValue;
        }

        /**
         * Gets the value of the dimTablename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDimTablename() {
            return dimTablename;
        }

        /**
         * Sets the value of the dimTablename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDimTablename(String value) {
            this.dimTablename = value;
        }

        /**
         * Gets the value of the dimColumnname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDimColumnname() {
            return dimColumnname;
        }

        /**
         * Sets the value of the dimColumnname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDimColumnname(String value) {
            this.dimColumnname = value;
        }

        /**
         * Gets the value of the dimDimcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDimDimcode() {
            return dimDimcode;
        }

        /**
         * Sets the value of the dimDimcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDimDimcode(String value) {
            this.dimDimcode = value;
        }

        /**
         * Gets the value of the dimColumndatatype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDimColumndatatype() {
            return dimColumndatatype;
        }

        /**
         * Sets the value of the dimColumndatatype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDimColumndatatype(String value) {
            this.dimColumndatatype = value;
        }

        /**
         * Gets the value of the dimOperator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDimOperator() {
            return dimOperator;
        }

        /**
         * Sets the value of the dimOperator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDimOperator(String value) {
            this.dimOperator = value;
        }

        /**
         * Gets the value of the facttablecolumn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacttablecolumn() {
            return facttablecolumn;
        }

        /**
         * Sets the value of the facttablecolumn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacttablecolumn(String value) {
            this.facttablecolumn = value;
        }

        /**
         * Gets the value of the modifierVisualattributes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifierVisualattributes() {
            return modifierVisualattributes;
        }

        /**
         * Sets the value of the modifierVisualattributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifierVisualattributes(String value) {
            this.modifierVisualattributes = value;
        }

        /**
         * Gets the value of the modifierSynonymCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifierSynonymCd() {
            return modifierSynonymCd;
        }

        /**
         * Sets the value of the modifierSynonymCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifierSynonymCd(String value) {
            this.modifierSynonymCd = value;
        }

        /**
         * Gets the value of the modifierTooltip property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifierTooltip() {
            return modifierTooltip;
        }

        /**
         * Sets the value of the modifierTooltip property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifierTooltip(String value) {
            this.modifierTooltip = value;
        }

        /**
         * Gets the value of the modifierClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifierClass() {
            return modifierClass;
        }

        /**
         * Sets the value of the modifierClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifierClass(String value) {
            this.modifierClass = value;
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
         *         &lt;element name="value_operator" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainOperatorType"/>
         *         &lt;element name="value_constraint" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="value_unit_of_measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="value_type" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainValueType"/>
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
            "valueOperator",
            "valueConstraint",
            "valueUnitOfMeasure",
            "valueType"
        })
        public static class ConstrainByValue {

            @XmlElement(name = "value_operator", required = true)
            @XmlSchemaType(name = "string")
            protected ConstrainOperatorType valueOperator;
            @XmlElement(name = "value_constraint", required = true)
            protected String valueConstraint;
            @XmlElement(name = "value_unit_of_measure", required = true)
            protected String valueUnitOfMeasure;
            @XmlElement(name = "value_type", required = true)
            @XmlSchemaType(name = "string")
            protected ConstrainValueType valueType;

            /**
             * Gets the value of the valueOperator property.
             * 
             * @return
             *     possible object is
             *     {@link ConstrainOperatorType }
             *     
             */
            public ConstrainOperatorType getValueOperator() {
                return valueOperator;
            }

            /**
             * Sets the value of the valueOperator property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConstrainOperatorType }
             *     
             */
            public void setValueOperator(ConstrainOperatorType value) {
                this.valueOperator = value;
            }

            /**
             * Gets the value of the valueConstraint property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValueConstraint() {
                return valueConstraint;
            }

            /**
             * Sets the value of the valueConstraint property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValueConstraint(String value) {
                this.valueConstraint = value;
            }

            /**
             * Gets the value of the valueUnitOfMeasure property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValueUnitOfMeasure() {
                return valueUnitOfMeasure;
            }

            /**
             * Sets the value of the valueUnitOfMeasure property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValueUnitOfMeasure(String value) {
                this.valueUnitOfMeasure = value;
            }

            /**
             * Gets the value of the valueType property.
             * 
             * @return
             *     possible object is
             *     {@link ConstrainValueType }
             *     
             */
            public ConstrainValueType getValueType() {
                return valueType;
            }

            /**
             * Sets the value of the valueType property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConstrainValueType }
             *     
             */
            public void setValueType(ConstrainValueType value) {
                this.valueType = value;
            }

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
     *         &lt;element name="value_operator" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainOperatorType"/>
     *         &lt;element name="value_constraint" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value_unit_of_measure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value_type" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}constrainValueType"/>
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
        "valueOperator",
        "valueConstraint",
        "valueUnitOfMeasure",
        "valueType"
    })
    public static class ConstrainByValue {

        @XmlElement(name = "value_operator", required = true)
        @XmlSchemaType(name = "string")
        protected ConstrainOperatorType valueOperator;
        @XmlElement(name = "value_constraint", required = true)
        protected String valueConstraint;
        @XmlElement(name = "value_unit_of_measure", required = true)
        protected String valueUnitOfMeasure;
        @XmlElement(name = "value_type", required = true)
        @XmlSchemaType(name = "string")
        protected ConstrainValueType valueType;

        /**
         * Gets the value of the valueOperator property.
         * 
         * @return
         *     possible object is
         *     {@link ConstrainOperatorType }
         *     
         */
        public ConstrainOperatorType getValueOperator() {
            return valueOperator;
        }

        /**
         * Sets the value of the valueOperator property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConstrainOperatorType }
         *     
         */
        public void setValueOperator(ConstrainOperatorType value) {
            this.valueOperator = value;
        }

        /**
         * Gets the value of the valueConstraint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueConstraint() {
            return valueConstraint;
        }

        /**
         * Sets the value of the valueConstraint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueConstraint(String value) {
            this.valueConstraint = value;
        }

        /**
         * Gets the value of the valueUnitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueUnitOfMeasure() {
            return valueUnitOfMeasure;
        }

        /**
         * Sets the value of the valueUnitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueUnitOfMeasure(String value) {
            this.valueUnitOfMeasure = value;
        }

        /**
         * Gets the value of the valueType property.
         * 
         * @return
         *     possible object is
         *     {@link ConstrainValueType }
         *     
         */
        public ConstrainValueType getValueType() {
            return valueType;
        }

        /**
         * Sets the value of the valueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConstrainValueType }
         *     
         */
        public void setValueType(ConstrainValueType value) {
            this.valueType = value;
        }

    }

}
