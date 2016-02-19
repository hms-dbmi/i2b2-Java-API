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
 * <p>Java class for queryJoinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryJoinType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="join_column" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}queryJoinColumnType"/>
 *         &lt;element name="aggregate_operator" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}queryAggregateOperatorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryJoinType", namespace = "http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/", propOrder = {
    "queryId",
    "joinColumn",
    "aggregateOperator"
})
public class QueryJoinType {

    @XmlElement(name = "query_id", required = true)
    protected String queryId;
    @XmlElement(name = "join_column", required = true)
    @XmlSchemaType(name = "string")
    protected QueryJoinColumnType joinColumn;
    @XmlElement(name = "aggregate_operator", required = true)
    @XmlSchemaType(name = "string")
    protected QueryAggregateOperatorType aggregateOperator;

    /**
     * Gets the value of the queryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * Sets the value of the queryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryId(String value) {
        this.queryId = value;
    }

    /**
     * Gets the value of the joinColumn property.
     * 
     * @return
     *     possible object is
     *     {@link QueryJoinColumnType }
     *     
     */
    public QueryJoinColumnType getJoinColumn() {
        return joinColumn;
    }

    /**
     * Sets the value of the joinColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryJoinColumnType }
     *     
     */
    public void setJoinColumn(QueryJoinColumnType value) {
        this.joinColumn = value;
    }

    /**
     * Gets the value of the aggregateOperator property.
     * 
     * @return
     *     possible object is
     *     {@link QueryAggregateOperatorType }
     *     
     */
    public QueryAggregateOperatorType getAggregateOperator() {
        return aggregateOperator;
    }

    /**
     * Sets the value of the aggregateOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryAggregateOperatorType }
     *     
     */
    public void setAggregateOperator(QueryAggregateOperatorType value) {
        this.aggregateOperator = value;
    }

}
