/**
 * 
 *  OCO Source Materials 
 *      � Copyright IBM Corp. 2012 
 *
 *      See the NOTICE file distributed with this work for additional 
 *      information regarding copyright ownership 
 *       
 *      Licensed under the Apache License, Version 2.0 (the "License"); 
 *      you may not use this file except in compliance with the License. 
 *      You may obtain a copy of the License at 
 *       	http://www.apache.org/licenses/LICENSE-2.0 
 *       
 *      Unless required by applicable law or agreed to in writing, software 
 *      distributed under the License is distributed on an "AS IS" BASIS, 
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 *      See the License for the specific language governing permissions and 
 *      limitations under the License. 
 *
 */
package org.universAAL.middleware.android.buses.contextbus.messages.handlers;

import org.universAAL.middleware.android.buses.contextbus.AndroidContextBus;
import org.universAAL.middleware.android.buses.contextbus.messages.ContextPublisherRequestMessage;
import org.universAAL.middleware.android.common.messages.IMessage;
import org.universAAL.middleware.android.localsodapop.AbstractSodaPopAndroidImpl;
import org.universAAL.middleware.android.localsodapop.messages.handlers.AbstractMessagePersistableHandler;

/**
 * 
 * @author <a href="mailto:noamsh@il.ibm.com">noamsh </a>
 * 
 *         May 21, 2012
 * 
 */
public class ContextPublisherRequestHandler extends AbstractMessagePersistableHandler {

    @Override
    protected void privateHandleMessage(IMessage message, AbstractSodaPopAndroidImpl sodaPop) {
	// Create the android context bus
	AndroidContextBus bus = createContextBus(message, sodaPop);

	// Cast to Context Publisher request message
	ContextPublisherRequestMessage contextPublisherMessage = (ContextPublisherRequestMessage) message;

	// Send the context publisher message
	bus.sendContextPublishMessage(contextPublisherMessage.getContextPublisherID(),
		contextPublisherMessage.getContextPublisherAction(),
		contextPublisherMessage.getExtrasSection());
    }
}