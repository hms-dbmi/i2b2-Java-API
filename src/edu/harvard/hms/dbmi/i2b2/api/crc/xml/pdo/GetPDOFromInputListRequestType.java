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
