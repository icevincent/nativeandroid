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
package org.universAAL.middleware.android.buses.servicebus.servicecaller.xml.objects;

import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.android.buses.servicebus.servicecaller.xml.IServiceRequestGroundingXmlConstants;
import org.universAAL.middleware.android.buses.servicebus.xml.objects.AbstractPropertiesContainer;
import org.universAAL.middleware.android.buses.servicebus.xml.objects.BundlePropertyXmlObj;
import org.universAAL.middleware.android.buses.servicebus.xml.objects.ICommonServiceBusXmlConstants;
import org.universAAL.middleware.android.common.CommonXmlParserUtils;
//import org.universAAL.middleware.android.common.xml.CommonXmlParserUtils;
import org.w3c.dom.Node;

import android.os.Bundle;

/**
 * 
 * @author <a href="mailto:noamsh@il.ibm.com">noamsh </a>
 * 
 *         May 20, 2012
 * 
 */
public abstract class AbstractParameterXmlObj extends
		AbstractPropertiesContainer {

	private static final long serialVersionUID = 1L;

	protected String androidExtraParameter;
	protected String androidExtraParameterJavaClass;
	protected String javaClass;

	public AbstractParameterXmlObj(Node parameterNode) {
		super(parameterNode);

		// Populate the attributes
		androidExtraParameter = CommonXmlParserUtils
				.getAttributeValueAsString(
						parameterNode,
						IServiceRequestGroundingXmlConstants.PARAMETER_ATTRIBUTE_ANDROID_EXTRA_PARAMETER);
		androidExtraParameterJavaClass = CommonXmlParserUtils
				.getAttributeValueAsString(
						parameterNode,
						IServiceRequestGroundingXmlConstants.PARAMETER_ATTRIBUTE_ANDROID_EXTRA_PARAMETER_JAVA_CLASS);
		javaClass = CommonXmlParserUtils
				.getAttributeValueAsString(
						parameterNode,
						IServiceRequestGroundingXmlConstants.PARAMETER_ATTRIBUTE_JAVA_CLASS);
	}

	public String getAndroidExtraParameter() {
		return androidExtraParameter;
	}

	public String getAndroidExtraParameterJavaClass() {
		return androidExtraParameterJavaClass;
	}

	public String getJavaClass() {
		return javaClass;
	}
}