/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paging_by_patients" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}pageByPatient_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageType", propOrder = {
    "pagingByPatients"
})
public class PageType {

    @XmlElement(name = "paging_by_patients", required = true)
    protected PageByPatientType pagingByPatients;

    /**
     * Gets the value of the pagingByPatients property.
     * 
     * @return
     *     possible object is
     *     {@link PageByPatientType }
     *     
     */
    public PageByPatientType getPagingByPatients() {
        return pagingByPatients;
    }

    /**
     * Sets the value of the pagingByPatients property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageByPatientType }
     *     
     */
    public void setPagingByPatients(PageByPatientType value) {
        this.pagingByPatients = value;
    }

}
