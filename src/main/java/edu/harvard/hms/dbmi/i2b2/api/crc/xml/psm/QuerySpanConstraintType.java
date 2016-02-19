/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for querySpanConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="querySpanConstraintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operator" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}queryOperatorType"/>
 *         &lt;element name="span_value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="units">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="YEAR"/>
 *               &lt;enumeration value="MONTH"/>
 *               &lt;enumeration value="DAY"/>
 *               &lt;enumeration value="HOUR"/>
 *               &lt;enumeration value="MINUTE"/>
 *               &lt;enumeration value="SECOND"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "querySpanConstraintType", namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", propOrder = {
    "operator",
    "spanValue",
    "units"
})
public class QuerySpanConstraintType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected QueryOperatorType operator;
    @XmlElement(name = "span_value")
    protected int spanValue;
    @XmlElement(required = true)
    protected String units;

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOperatorType }
     *     
     */
    public QueryOperatorType getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOperatorType }
     *     
     */
    public void setOperator(QueryOperatorType value) {
        this.operator = value;
    }

    /**
     * Gets the value of the spanValue property.
     * 
     */
    public int getSpanValue() {
        return spanValue;
    }

    /**
     * Sets the value of the spanValue property.
     * 
     */
    public void setSpanValue(int value) {
        this.spanValue = value;
    }

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

}
