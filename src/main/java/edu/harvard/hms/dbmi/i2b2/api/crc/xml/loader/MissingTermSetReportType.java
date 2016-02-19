/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for missing_term_set_reportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="missing_term_set_reportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="mapped" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="unmapped" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "missing_term_set_reportType")
public class MissingTermSetReportType {

    @XmlAttribute(name = "mapped")
    protected Integer mapped;
    @XmlAttribute(name = "unmapped")
    protected Integer unmapped;

    /**
     * Gets the value of the mapped property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMapped() {
        return mapped;
    }

    /**
     * Sets the value of the mapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMapped(Integer value) {
        this.mapped = value;
    }

    /**
     * Gets the value of the unmapped property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnmapped() {
        return unmapped;
    }

    /**
     * Sets the value of the unmapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnmapped(Integer value) {
        this.unmapped = value;
    }

}
