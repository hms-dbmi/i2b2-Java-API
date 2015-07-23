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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message_body" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}publish_data_request"/>
 *                   &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}load_data_response"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageBody"
})
@XmlRootElement(name = "examples")
public class Examples {

    @XmlElement(name = "message_body", required = true)
    protected List<Examples.MessageBody> messageBody;

    /**
     * Gets the value of the messageBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Examples.MessageBody }
     * 
     * 
     */
    public List<Examples.MessageBody> getMessageBody() {
        if (messageBody == null) {
            messageBody = new ArrayList<Examples.MessageBody>();
        }
        return this.messageBody;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}publish_data_request"/>
     *         &lt;element ref="{http://www.i2b2.org/xsd/cell/crc/loader/1.1/}load_data_response"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publishDataRequest",
        "loadDataResponse"
    })
    public static class MessageBody {

        @XmlElement(name = "publish_data_request", namespace = "http://www.i2b2.org/xsd/cell/crc/loader/1.1/", required = true)
        protected PublishDataRequestType publishDataRequest;
        @XmlElement(name = "load_data_response", namespace = "http://www.i2b2.org/xsd/cell/crc/loader/1.1/", required = true)
        protected LoadDataResponseType loadDataResponse;

        /**
         * Gets the value of the publishDataRequest property.
         * 
         * @return
         *     possible object is
         *     {@link PublishDataRequestType }
         *     
         */
        public PublishDataRequestType getPublishDataRequest() {
            return publishDataRequest;
        }

        /**
         * Sets the value of the publishDataRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link PublishDataRequestType }
         *     
         */
        public void setPublishDataRequest(PublishDataRequestType value) {
            this.publishDataRequest = value;
        }

        /**
         * Gets the value of the loadDataResponse property.
         * 
         * @return
         *     possible object is
         *     {@link LoadDataResponseType }
         *     
         */
        public LoadDataResponseType getLoadDataResponse() {
            return loadDataResponse;
        }

        /**
         * Sets the value of the loadDataResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link LoadDataResponseType }
         *     
         */
        public void setLoadDataResponse(LoadDataResponseType value) {
            this.loadDataResponse = value;
        }

    }

}
