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
