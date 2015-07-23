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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for query_definition_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="query_definition_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}requestType">
 *       &lt;sequence>
 *         &lt;element name="query_definition" type="{http://www.i2b2.org/xsd/cell/crc/psm/querydefinition/1.1/}query_definitionType"/>
 *         &lt;element name="result_output_list" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}result_output_optionListType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "query_definition_requestType", propOrder = {
    "queryDefinition",
    "resultOutputList"
})
public class QueryDefinitionRequestType
    extends RequestType
{

    @XmlElement(name = "query_definition", required = true)
    protected QueryDefinitionType queryDefinition;
    @XmlElement(name = "result_output_list", required = true)
    protected ResultOutputOptionListType resultOutputList;

    /**
     * Gets the value of the queryDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link QueryDefinitionType }
     *     
     */
    public QueryDefinitionType getQueryDefinition() {
        return queryDefinition;
    }

    /**
     * Sets the value of the queryDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryDefinitionType }
     *     
     */
    public void setQueryDefinition(QueryDefinitionType value) {
        this.queryDefinition = value;
    }

    /**
     * Gets the value of the resultOutputList property.
     * 
     * @return
     *     possible object is
     *     {@link ResultOutputOptionListType }
     *     
     */
    public ResultOutputOptionListType getResultOutputList() {
        return resultOutputList;
    }

    /**
     * Sets the value of the resultOutputList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOutputOptionListType }
     *     
     */
    public void setResultOutputList(ResultOutputOptionListType value) {
        this.resultOutputList = value;
    }

}
