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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="query_status_type" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_status_typeType"/>
 *         &lt;element name="query_result_type" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_result_typeType"/>
 *         &lt;element name="query_master" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_masterType"/>
 *         &lt;element name="query_instance" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_instanceType"/>
 *         &lt;element name="query_result_instance" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_result_instanceType"/>
 *         &lt;element name="patient_enc_collection" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}patient_enc_collectionType"/>
 *         &lt;element name="patient_set_collection" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}patient_set_collectionType"/>
 *         &lt;element name="xml_result" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}xml_resultType"/>
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
    "queryStatusType",
    "queryResultType",
    "queryMaster",
    "queryInstance",
    "queryResultInstance",
    "patientEncCollection",
    "patientSetCollection",
    "xmlResult"
})
@XmlRootElement(name = "datatypes_example")
public class DatatypesExample {

    @XmlElement(name = "query_status_type", required = true)
    protected QueryStatusTypeType queryStatusType;
    @XmlElement(name = "query_result_type", required = true)
    protected QueryResultTypeType queryResultType;
    @XmlElement(name = "query_master", required = true)
    protected QueryMasterType queryMaster;
    @XmlElement(name = "query_instance", required = true)
    protected QueryInstanceType queryInstance;
    @XmlElement(name = "query_result_instance", required = true)
    protected QueryResultInstanceType queryResultInstance;
    @XmlElement(name = "patient_enc_collection", required = true)
    protected PatientEncCollectionType patientEncCollection;
    @XmlElement(name = "patient_set_collection", required = true)
    protected PatientSetCollectionType patientSetCollection;
    @XmlElement(name = "xml_result", required = true)
    protected XmlResultType xmlResult;

    /**
     * Gets the value of the queryStatusType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryStatusTypeType }
     *     
     */
    public QueryStatusTypeType getQueryStatusType() {
        return queryStatusType;
    }

    /**
     * Sets the value of the queryStatusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryStatusTypeType }
     *     
     */
    public void setQueryStatusType(QueryStatusTypeType value) {
        this.queryStatusType = value;
    }

    /**
     * Gets the value of the queryResultType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultTypeType }
     *     
     */
    public QueryResultTypeType getQueryResultType() {
        return queryResultType;
    }

    /**
     * Sets the value of the queryResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultTypeType }
     *     
     */
    public void setQueryResultType(QueryResultTypeType value) {
        this.queryResultType = value;
    }

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
     * @return
     *     possible object is
     *     {@link QueryResultInstanceType }
     *     
     */
    public QueryResultInstanceType getQueryResultInstance() {
        return queryResultInstance;
    }

    /**
     * Sets the value of the queryResultInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultInstanceType }
     *     
     */
    public void setQueryResultInstance(QueryResultInstanceType value) {
        this.queryResultInstance = value;
    }

    /**
     * Gets the value of the patientEncCollection property.
     * 
     * @return
     *     possible object is
     *     {@link PatientEncCollectionType }
     *     
     */
    public PatientEncCollectionType getPatientEncCollection() {
        return patientEncCollection;
    }

    /**
     * Sets the value of the patientEncCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientEncCollectionType }
     *     
     */
    public void setPatientEncCollection(PatientEncCollectionType value) {
        this.patientEncCollection = value;
    }

    /**
     * Gets the value of the patientSetCollection property.
     * 
     * @return
     *     possible object is
     *     {@link PatientSetCollectionType }
     *     
     */
    public PatientSetCollectionType getPatientSetCollection() {
        return patientSetCollection;
    }

    /**
     * Sets the value of the patientSetCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientSetCollectionType }
     *     
     */
    public void setPatientSetCollection(PatientSetCollectionType value) {
        this.patientSetCollection = value;
    }

    /**
     * Gets the value of the xmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link XmlResultType }
     *     
     */
    public XmlResultType getXmlResult() {
        return xmlResult;
    }

    /**
     * Sets the value of the xmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlResultType }
     *     
     */
    public void setXmlResult(XmlResultType value) {
        this.xmlResult = value;
    }

}
