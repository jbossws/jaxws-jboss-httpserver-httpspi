/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License).  You may not use this file except in
 * compliance with the License.
 * 
 * You can obtain a copy of the license at
 * https://glassfish.dev.java.net/public/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at https://glassfish.dev.java.net/public/CDDLv1.0.html.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * you own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 * 
 * Copyright 2006 Sun Microsystems Inc. All Rights Reserved
 */

package org.jboss.com.sun.tools.ws.processor.config;

import org.jboss.com.sun.tools.ws.processor.util.ProcessorEnvironment;

/**
 *
 * @author WS Development Team
 */
public class Configuration {

    public Configuration(ProcessorEnvironment env) {
        _env = (ProcessorEnvironment)env;
    }

    public ModelInfo getModelInfo() {
        return _modelInfo;
    }

    public void setModelInfo(ModelInfo i) {
        _modelInfo = (ModelInfo)i;
        _modelInfo.setParent(this);
    }

    public ProcessorEnvironment getEnvironment() {
        return _env;
    }

    private ProcessorEnvironment _env;
    private ModelInfo _modelInfo;
}
