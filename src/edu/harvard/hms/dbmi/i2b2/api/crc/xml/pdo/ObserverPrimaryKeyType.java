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
 * <p>Java class for observer_primary_key_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="observer_primary_key_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="observer_path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="observer_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "observer_primary_key_Type", propOrder = {
    "observerPath",
    "observerId"
})
public class ObserverPrimaryKeyType {

    @XmlElement(name = "observer_path", required = true)
    protected String observerPath;
    @XmlElement(name = "observer_id", required = true)
    protected String observerId;

    /**
     * Gets the value of the observerPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObserverPath() {
        return observerPath;
    }

    /**
     * Sets the value of the observerPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObserverPath(String value) {
        this.observerPath = value;
    }

    /**
     * Gets the value of the observerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObserverId() {
        return observerId;
    }

    /**
     * Sets the value of the observerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObserverId(String value) {
        this.observerId = value;
    }

}
