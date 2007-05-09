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
/** Java interface "Encoder.java" generated from Poseidon for UML.
 *  Poseidon for UML is developed by <A HREF="http://www.gentleware.com">Gentleware</A>.
 *  Generated with <A HREF="http://jakarta.apache.org/velocity/">velocity</A> template engine.
 */
package org.jboss.com.sun.xml.ws.pept.encoding;

import java.nio.ByteBuffer;

import org.jboss.com.sun.xml.ws.pept.ept.MessageInfo;

/**
 * <p>
 * 
 * @author Arun Gupta
 * </p>
 */
public interface Encoder {

  ///////////////////////////////////////
  // operations

/**
 * <p>
 * Does ...
 * </p><p>
 * 
 * </p><p>
 * 
 * @param messageInfo ...
 * </p>
 */
    public void encodeAndSend(MessageInfo messageInfo);
/**
 * <p>
 * Does ...
 * </p><p>
 * 
 * @return a ByteBuffer with ...
 * </p><p>
 * @param messageInfo ...
 * </p>
 */
    public ByteBuffer encode(MessageInfo messageInfo);

} // end Encoder







