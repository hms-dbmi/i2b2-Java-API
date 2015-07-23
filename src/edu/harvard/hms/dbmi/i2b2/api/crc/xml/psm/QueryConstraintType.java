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
 * <p>Java class for queryConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryConstraintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="constraint_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="first_query" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}queryJoinType"/>
 *         &lt;element name="operator" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}queryOperatorType"/>
 *         &lt;element name="second_query" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}queryJoinType"/>
 *         &lt;element name="span" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}querySpanConstraintType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryConstraintType", namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", propOrder = {
    "constraintType",
    "firstQuery",
    "operator",
    "secondQuery",
    "span"
})
public class QueryConstraintType {

    @XmlElement(name = "constraint_type")
    protected String constraintType;
    @XmlElement(name = "first_query", required = true)
    protected QueryJoinType firstQuery;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected QueryOperatorType operator;
    @XmlElement(name = "second_query", required = true)
    protected QueryJoinType secondQuery;
    protected List<QuerySpanConstraintType> span;

    /**
     * Gets the value of the constraintType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintType() {
        return constraintType;
    }

    /**
     * Sets the value of the constraintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintType(String value) {
        this.constraintType = value;
    }

    /**
     * Gets the value of the firstQuery property.
     * 
     * @return
     *     possible object is
     *     {@link QueryJoinType }
     *     
     */
    public QueryJoinType getFirstQuery() {
        return firstQuery;
    }

    /**
     * Sets the value of the firstQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryJoinType }
     *     
     */
    public void setFirstQuery(QueryJoinType value) {
        this.firstQuery = value;
    }

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
     * Gets the value of the secondQuery property.
     * 
     * @return
     *     possible object is
     *     {@link QueryJoinType }
     *     
     */
    public QueryJoinType getSecondQuery() {
        return secondQuery;
    }

    /**
     * Sets the value of the secondQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryJoinType }
     *     
     */
    public void setSecondQuery(QueryJoinType value) {
        this.secondQuery = value;
    }

    /**
     * Gets the value of the span property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the span property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySpanConstraintType }
     * 
     * 
     */
    public List<QuerySpanConstraintType> getSpan() {
        if (span == null) {
            span = new ArrayList<QuerySpanConstraintType>();
        }
        return this.span;
    }

}
