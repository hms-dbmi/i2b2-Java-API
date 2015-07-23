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
