/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.pdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPDOFromInputList_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPDOFromInputList_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}requestType">
 *       &lt;sequence>
 *         &lt;element name="input_list" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}input_option_listType"/>
 *         &lt;element name="filter_list" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}filter_listType"/>
 *         &lt;element name="output_option" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_option_listType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPDOFromInputList_requestType", propOrder = {
    "inputList",
    "filterList",
    "outputOption"
})
public class GetPDOFromInputListRequestType
    extends RequestType
{

    @XmlElement(name = "input_list", required = true)
    protected InputOptionListType inputList;
    @XmlElement(name = "filter_list", required = true)
    protected FilterListType filterList;
    @XmlElement(name = "output_option", required = true)
    protected OutputOptionListType outputOption;

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
     * Gets the value of the filterList property.
     * 
     * @return
     *     possible object is
     *     {@link FilterListType }
     *     
     */
    public FilterListType getFilterList() {
        return filterList;
    }

    /**
     * Sets the value of the filterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterListType }
     *     
     */
    public void setFilterList(FilterListType value) {
        this.filterList = value;
    }

    /**
     * Gets the value of the outputOption property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionListType }
     *     
     */
    public OutputOptionListType getOutputOption() {
        return outputOption;
    }

    /**
     * Sets the value of the outputOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionListType }
     *     
     */
    public void setOutputOption(OutputOptionListType value) {
        this.outputOption = value;
    }

}
