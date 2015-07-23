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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filter_listType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filter_listType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="query_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="query_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="query_timing" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}queryTimingType"/>
 *           &lt;element name="panel" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}panelType" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filter_listType", propOrder = {
    "queryName",
    "queryDescription",
    "queryTiming",
    "panel"
})
public class FilterListType {

    @XmlElement(name = "query_name", required = true)
    protected String queryName;
    @XmlElement(name = "query_description", required = true)
    protected String queryDescription;
    @XmlElement(name = "query_timing", required = true, defaultValue = "ANY")
    @XmlSchemaType(name = "string")
    protected QueryTimingType queryTiming;
    @XmlElement(required = true)
    protected List<PanelType> panel;

    /**
     * Gets the value of the queryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryName() {
        return queryName;
    }

    /**
     * Sets the value of the queryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryName(String value) {
        this.queryName = value;
    }

    /**
     * Gets the value of the queryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryDescription() {
        return queryDescription;
    }

    /**
     * Sets the value of the queryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryDescription(String value) {
        this.queryDescription = value;
    }

    /**
     * Gets the value of the queryTiming property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTimingType }
     *     
     */
    public QueryTimingType getQueryTiming() {
        return queryTiming;
    }

    /**
     * Sets the value of the queryTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTimingType }
     *     
     */
    public void setQueryTiming(QueryTimingType value) {
        this.queryTiming = value;
    }

    /**
     * Gets the value of the panel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPanel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PanelType }
     * 
     * 
     */
    public List<PanelType> getPanel() {
        if (panel == null) {
            panel = new ArrayList<PanelType>();
        }
        return this.panel;
    }

}
