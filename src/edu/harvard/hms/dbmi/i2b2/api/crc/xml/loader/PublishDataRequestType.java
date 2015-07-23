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

package edu.harvard.hms.dbmi.i2b2.api.crc.xml.loader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for publish_data_request_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publish_data_request_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="input_list" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}input_option_listType"/>
 *         &lt;element name="load_list" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}loadType"/>
 *         &lt;element name="output_list" type="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}output_option_listType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publish_data_request_type", propOrder = {

})
public class PublishDataRequestType {

    @XmlElement(name = "input_list", required = true)
    protected InputOptionListType inputList;
    @XmlElement(name = "load_list", required = true)
    protected LoadType loadList;
    @XmlElement(name = "output_list", required = true)
    protected OutputOptionListType outputList;

    /**
     * Gets the value of the inputList property.
     * 
     * @return
     *     possible object is
     *     {@link InputOptionListType }
     *     
     */
    public InputOptionListType getInputList() {
        return inputList;
    }

    /**
     * Sets the value of the inputList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputOptionListType }
     *     
     */
    public void setInputList(InputOptionListType value) {
        this.inputList = value;
    }

    /**
     * Gets the value of the loadList property.
     * 
     * @return
     *     possible object is
     *     {@link LoadType }
     *     
     */
    public LoadType getLoadList() {
        return loadList;
    }

    /**
     * Sets the value of the loadList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadType }
     *     
     */
    public void setLoadList(LoadType value) {
        this.loadList = value;
    }

    /**
     * Gets the value of the outputList property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionListType }
     *     
     */
    public OutputOptionListType getOutputList() {
        return outputList;
    }

    /**
     * Sets the value of the outputList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionListType }
     *     
     */
    public void setOutputList(OutputOptionListType value) {
        this.outputList = value;
    }

}
