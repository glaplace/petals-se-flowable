/**
 * Copyright (c) 2014 Linagora
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
 * along with this program/library; If not, see <http://www.gnu.org/licenses/>
 * for the GNU Lesser General Public License version 2.1.
 */
package org.ow2.petals.activitibpmn.operation.annotated;

import java.util.Properties;
import java.util.Set;

import org.ow2.petals.activitibpmn.operation.annotated.exception.InvalidAnnotationForOperationException;

/**
 * The BPMN operation 'start event' extracted from WDSL according to BPMN annotations. This operation is used to create
 * a new instance of the process.
 * 
 * @author Christophe DENEUX - Linagora
 * 
 */
public class StartEventAnnotatedOperation extends AnnotatedOperation {

    public static final String BPMN_ACTION_TYPE = "startEvent";

    public StartEventAnnotatedOperation(final String wsdlOperationName, final String processIdentifier,
            final String bpmnAction, final Properties processInstanceIdHolder, final Properties userIdHolder,
            final Properties bpmnVarInMsg, final Properties outMsgBpmnVar, final Properties faultMsgBpmnVar,
            final Set<String> bpmnVarList) throws InvalidAnnotationForOperationException {
        super(wsdlOperationName, processIdentifier, bpmnAction, processInstanceIdHolder, userIdHolder, bpmnVarInMsg,
                outMsgBpmnVar, faultMsgBpmnVar, bpmnVarList);
    }

    @Override
    public String getBpmnActionType() {
        return BPMN_ACTION_TYPE;
    }

}
