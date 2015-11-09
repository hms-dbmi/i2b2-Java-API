/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pageByPatient_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pageByPatient_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="patients_requested" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}pageRange_Type"/>
 *         &lt;element name="patients_returned" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}pageRange_Type"/>
 *         &lt;element name="patients_skipped" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}pageRange_Type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="page_size" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="facts_total" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="facts_returned" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageByPatient_Type", propOrder = {
    "patientsRequested",
    "patientsReturned",
    "patientsSkipped"
})
public class PageByPatientType {

    @XmlElement(name = "patients_requested", required = true)
    protected PageRangeType patientsRequested;
    @XmlElement(name = "patients_returned", required = true)
    protected PageRangeType patientsReturned;
    @XmlElement(name = "patients_skipped", required = true)
    protected PageRangeType patientsSkipped;
    @XmlAttribute(name = "page_size")
    protected Long pageSize;
    @XmlAttribute(name = "facts_total")
    protected Long factsTotal;
    @XmlAttribute(name = "facts_returned")
    protected Long factsReturned;

    /**
     * Gets the value of the patientsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link PageRangeType }
     *     
     */
    public PageRangeType getPatientsRequested() {
        return patientsRequested;
    }

    /**
     * Sets the value of the patientsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageRangeType }
     *     
     */
    public void setPatientsRequested(PageRangeType value) {
        this.patientsRequested = value;
    }

    /**
     * Gets the value of the patientsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link PageRangeType }
     *     
     */
    public PageRangeType getPatientsReturned() {
        return patientsReturned;
    }

    /**
     * Sets the value of the patientsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageRangeType }
     *     
     */
    public void setPatientsReturned(PageRangeType value) {
        this.patientsReturned = value;
    }

    /**
     * Gets the value of the patientsSkipped property.
     * 
     * @return
     *     possible object is
     *     {@link PageRangeType }
     *     
     */
    public PageRangeType getPatientsSkipped() {
        return patientsSkipped;
    }

    /**
     * Sets the value of the patientsSkipped property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageRangeType }
     *     
     */
    public void setPatientsSkipped(PageRangeType value) {
        this.patientsSkipped = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageSize(Long value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the factsTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFactsTotal() {
        return factsTotal;
    }

    /**
     * Sets the value of the factsTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFactsTotal(Long value) {
        this.factsTotal = value;
    }

    /**
     * Gets the value of the factsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFactsReturned() {
        return factsReturned;
    }

    /**
     * Sets the value of the factsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFactsReturned(Long value) {
        this.factsReturned = value;
    }

}
