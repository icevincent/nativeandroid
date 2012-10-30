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
package org.universAAL.middleware.android.localsodapop.persistence.tables.rows;

/**
 * 
 * @author <a href="mailto:noamsh@il.ibm.com">noamsh </a>
 * 
 *         Apr 5, 2012
 * 
 */
public class LocalBusRowDB extends AbstractBusRowDB {

    private String busPackageName;
    private String busClassName;

    public String getBusPackageName() {
	return busPackageName;
    }

    public void setBusPackageName(String busPackageName) {
	this.busPackageName = busPackageName;
    }

    public String getBusClassName() {
	return busClassName;
    }

    public void setBusClassName(String busClassName) {
	this.busClassName = busClassName;
    }

    @Override
    public String toString() {
	return "LocalBusRowDB [busPackageName=" + busPackageName + ", busClassName=" + busClassName
		+ ", toString()=" + super.toString() + "]";
    }
}