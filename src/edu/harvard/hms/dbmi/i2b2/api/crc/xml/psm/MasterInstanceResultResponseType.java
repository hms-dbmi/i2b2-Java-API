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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for master_instance_result_responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="master_instance_result_responseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}responseType">
 *       &lt;sequence>
 *         &lt;element name="query_master" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_masterType"/>
 *         &lt;element name="query_instance" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_instanceType" minOccurs="0"/>
 *         &lt;element name="query_result_instance" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_result_instanceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_instance_result_responseType", propOrder = {
    "queryMaster",
    "queryInstance",
    "queryResultInstance"
})
public class MasterInstanceResultResponseType
    extends ResponseType
{

    @XmlElement(name = "query_master", required = true)
    protected QueryMasterType queryMaster;
    @XmlElement(name = "query_instance")
    protected QueryInstanceType queryInstance;
    @XmlElement(name = "query_result_instance")
    protected List<QueryResultInstanceType> queryResultInstance;

    /**
     * Gets the value of the queryMaster property.
     * 
     * @return
     *     possible object is
     *     {@link QueryMasterType }
     *     
     */
    public QueryMasterType getQueryMaster() {
        return queryMaster;
    }

    /**
     * Sets the value of the queryMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryMasterType }
     *     
     */
    public void setQueryMaster(QueryMasterType value) {
        this.queryMaster = value;
    }

    /**
     * Gets the value of the queryInstance property.
     * 
     * @return
     *     possible object is
     *     {@link QueryInstanceType }
     *     
     */
    public QueryInstanceType getQueryInstance() {
        return queryInstance;
    }

    /**
     * Sets the value of the queryInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryInstanceType }
     *     
     */
    public void setQueryInstance(QueryInstanceType value) {
        this.queryInstance = value;
    }

    /**
     * Gets the value of the queryResultInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryResultInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryResultInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryResultInstanceType }
     * 
     * 
     */
    public List<QueryResultInstanceType> getQueryResultInstance() {
        if (queryResultInstance == null) {
            queryResultInstance = new ArrayList<QueryResultInstanceType>();
        }
        return this.queryResultInstance;
    }

}
