/**
 * Copyright (c) 2019-2025 Linagora
 * 
 * This program/library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 2.1 of the License, or (at your
 * option) any later version.
 * 
 * This program/library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program/library; If not, see http://www.gnu.org/licenses/
 * for the GNU Lesser General Public License version 2.1.
 */
package org.ow2.petals.flowable.incoming.operation.annotated.exception;

import javax.xml.namespace.QName;

/**
 * The XSL file name is not a regular file
 * 
 * @author Christophe DENEUX - Linagora
 *
 */
public class XslNotFileException extends InvalidAnnotationForOperationException {

    private static final long serialVersionUID = 2374171187469635809L;

    private static final String MESSAGE_PATTERN = "The XSL file name '%s' is not a regular file for variable '%s'";

    public XslNotFileException(final QName wsdlOperation, final String variableName, final String xslFilename) {
        super(wsdlOperation, String.format(MESSAGE_PATTERN, xslFilename, variableName));
    }

}
