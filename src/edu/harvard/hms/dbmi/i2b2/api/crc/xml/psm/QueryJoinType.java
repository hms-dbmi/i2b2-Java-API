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
