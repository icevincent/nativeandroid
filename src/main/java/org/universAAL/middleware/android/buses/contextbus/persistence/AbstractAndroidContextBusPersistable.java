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
package org.universAAL.middleware.android.buses.contextbus.persistence;

import android.content.Context;

/**
 * 
 * @author <a href="mailto:noamsh@il.ibm.com">noamsh </a>
 * 
 *         Apr 22, 2012
 * 
 */
public abstract class AbstractAndroidContextBusPersistable {

    protected ContextBusSQLiteMngr sqliteMngr;
    protected Context context;

    public AbstractAndroidContextBusPersistable() {
    }

    public AbstractAndroidContextBusPersistable(Context context) {
	populateSqlMngr(context);
    }

    protected void populateSqlMngr(Context context) {
	sqliteMngr = new ContextBusSQLiteMngr(context);

	this.context = context;
    }
}
