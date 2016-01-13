/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instance_responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instance_responseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}responseType">
 *       &lt;sequence>
 *         &lt;element name="query_instance" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_instanceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instance_responseType", propOrder = {
    "queryInstance"
})
public class InstanceResponseType
    extends ResponseType
{

    @XmlElement(name = "query_instance", required = true)
    protected List<QueryInstanceType> queryInstance;

    /**
     * Gets the value of the queryInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryInstanceType }
     * 
     * 
     */
    public List<QueryInstanceType> getQueryInstance() {
        if (queryInstance == null) {
            queryInstance = new ArrayList<QueryInstanceType>();
        }
        return this.queryInstance;
    }

}
