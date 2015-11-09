/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
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
