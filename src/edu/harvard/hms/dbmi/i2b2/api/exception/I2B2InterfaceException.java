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
}
