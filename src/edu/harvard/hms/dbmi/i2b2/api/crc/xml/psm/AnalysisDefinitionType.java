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

package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for analysis_definitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="analysis_definitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="analysis_plugin_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="crc_analysis_input_param" type="{http://www.i2b2.org/xsd/cell/crc/psm/analysisdefinition/1.1/}crc_analysis_input_paramType"/>
 *         &lt;element name="crc_analysis_result_list" type="{http://www.i2b2.org/xsd/cell/crc/psm/analysisdefinition/1.1/}analysis_result_optionListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "analysis_definitionType", namespace = "http://www.i2b2.org/xsd/cell/crc/psm/analysisdefinition/1.1/", propOrder = {
    "analysisPluginName",
    "version",
    "crcAnalysisInputParam",
    "crcAnalysisResultList"
})
public class AnalysisDefinitionType {

    @XmlElement(name = "analysis_plugin_name", required = true)
    protected String analysisPluginName;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(name = "crc_analysis_input_param", required = true)
    protected CrcAnalysisInputParamType crcAnalysisInputParam;
    @XmlElement(name = "crc_analysis_result_list", required = true)
    protected AnalysisResultOptionListType crcAnalysisResultList;

    /**
     * Gets the value of the analysisPluginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisPluginName() {
        return analysisPluginName;
    }

    /**
     * Sets the value of the analysisPluginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisPluginName(String value) {
        this.analysisPluginName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the crcAnalysisInputParam property.
     * 
     * @return
     *     possible object is
     *     {@link CrcAnalysisInputParamType }
     *     
     */
    public CrcAnalysisInputParamType getCrcAnalysisInputParam() {
        return crcAnalysisInputParam;
    }

    /**
     * Sets the value of the crcAnalysisInputParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrcAnalysisInputParamType }
     *     
     */
    public void setCrcAnalysisInputParam(CrcAnalysisInputParamType value) {
        this.crcAnalysisInputParam = value;
    }

    /**
     * Gets the value of the crcAnalysisResultList property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisResultOptionListType }
     *     
     */
    public AnalysisResultOptionListType getCrcAnalysisResultList() {
        return crcAnalysisResultList;
    }

    /**
     * Sets the value of the crcAnalysisResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisResultOptionListType }
     *     
     */
    public void setCrcAnalysisResultList(AnalysisResultOptionListType value) {
        this.crcAnalysisResultList = value;
    }

}
