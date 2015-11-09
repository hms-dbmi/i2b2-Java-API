/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.i2b2.api.exception;

/**
 * An i2b2 Interface Exception occurs of some type
 * 
 * @author Jeremy R. Easton-Marks
 *
 */
public class I2B2InterfaceException extends Exception {
	
	private static final long serialVersionUID = 8333354802893938958L;

	public I2B2InterfaceException(String message) {
		super(message);
	}

	public I2B2InterfaceException(String message, Exception e) {
		super(message, e);
	}
}
