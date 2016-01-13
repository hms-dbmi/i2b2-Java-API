/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.crc.xml.psm;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class HiveRequest
    extends JAXBElement<RequestMessageType>
{

    protected final static QName NAME = new QName("http://www.i2b2.org/xsd/hive/msg/1.1/", "request");

    public HiveRequest(RequestMessageType value) {
        super(NAME, ((Class) RequestMessageType.class), null, value);
    }

    public HiveRequest() {
        super(NAME, ((Class) RequestMessageType.class), null, null);
    }

}
