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

package edu.harvard.hms.dbmi.i2b2.api.pm.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="environment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="helpURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.i2b2.org/xsd/cell/pm/1.1/}userType"/>
 *         &lt;element name="domain_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domain_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cell_datas" type="{http://www.i2b2.org/xsd/cell/pm/1.1/}cell_datasType"/>
 *         &lt;element name="global_data" type="{http://www.i2b2.org/xsd/cell/pm/1.1/}global_dataType"/>
 *         &lt;element name="param" type="{http://www.i2b2.org/xsd/cell/pm/1.1/}paramType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configureType", propOrder = {
    "environment",
    "helpURL",
    "user",
    "domainName",
    "domainId",
    "active",
    "cellDatas",
    "globalData",
    "param"
})
public class ConfigureType {

    @XmlElement(required = true)
    protected String environment;
    @XmlElement(required = true)
    protected String helpURL;
    @XmlElement(required = true)
    protected UserType user;
    @XmlElement(name = "domain_name")
    protected String domainName;
    @XmlElement(name = "domain_id")
    protected String domainId;
    protected Boolean active;
    @XmlElement(name = "cell_datas", required = true)
    protected CellDatasType cellDatas;
    @XmlElement(name = "global_data", required = true)
    protected GlobalDataType globalData;
    protected List<ParamType> param;

    /**
     * Gets the value of the environment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Sets the value of the environment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironment(String value) {
        this.environment = value;
    }

    /**
     * Gets the value of the helpURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelpURL() {
        return helpURL;
    }

    /**
     * Sets the value of the helpURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelpURL(String value) {
        this.helpURL = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the domainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * Sets the value of the domainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainId(String value) {
        this.domainId = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the cellDatas property.
     * 
     * @return
     *     possible object is
     *     {@link CellDatasType }
     *     
     */
    public CellDatasType getCellDatas() {
        return cellDatas;
    }

    /**
     * Sets the value of the cellDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellDatasType }
     *     
     */
    public void setCellDatas(CellDatasType value) {
        this.cellDatas = value;
    }

    /**
     * Gets the value of the globalData property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalDataType }
     *     
     */
    public GlobalDataType getGlobalData() {
        return globalData;
    }

    /**
     * Sets the value of the globalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalDataType }
     *     
     */
    public void setGlobalData(GlobalDataType value) {
        this.globalData = value;
    }

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamType }
     * 
     * 
     */
    public List<ParamType> getParam() {
        if (param == null) {
            param = new ArrayList<ParamType>();
        }
        return this.param;
    }

}
