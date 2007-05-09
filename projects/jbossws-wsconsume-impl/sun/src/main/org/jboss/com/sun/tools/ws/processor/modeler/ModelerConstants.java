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

package org.jboss.com.sun.tools.ws.processor.modeler;


/**
 *
 * @author WS Development Team
 */
public interface ModelerConstants {

    public static final String BRACKETS  = "[]";
    public static final String FALSE_STR = "false";
    public static final String ZERO_STR  = "0";
    public static final String NULL_STR  = "null";
    public static final String ARRAY_STR = "Array";

    /*
     * Java ClassNames
     */
    /*
      * Java ClassNames
      */
     public static final String IOEXCEPTION_CLASSNAME         = "java.io.IOException";
     public static final String BOOLEAN_CLASSNAME             = "boolean";
     public static final String BOXED_BOOLEAN_CLASSNAME       = "java.lang.Boolean";
     public static final String BYTE_CLASSNAME                = "byte";
     public static final String BYTE_ARRAY_CLASSNAME          = BYTE_CLASSNAME+BRACKETS;
     public static final String BOXED_BYTE_CLASSNAME          = "java.lang.Byte";
     public static final String BOXED_BYTE_ARRAY_CLASSNAME    = BOXED_BYTE_CLASSNAME+BRACKETS;
     public static final String CLASS_CLASSNAME               = "java.lang.Class";
     public static final String CHAR_CLASSNAME                = "char";
     public static final String BOXED_CHAR_CLASSNAME          = "java.lang.Character";
     public static final String DOUBLE_CLASSNAME              = "double";
     public static final String BOXED_DOUBLE_CLASSNAME        = "java.lang.Double";
     public static final String FLOAT_CLASSNAME               = "float";
     public static final String BOXED_FLOAT_CLASSNAME         = "java.lang.Float";
     public static final String INT_CLASSNAME                 = "int";
     public static final String BOXED_INTEGER_CLASSNAME       = "java.lang.Integer";
     public static final String LONG_CLASSNAME                = "long";
     public static final String BOXED_LONG_CLASSNAME          = "java.lang.Long";
     public static final String SHORT_CLASSNAME               = "short";
     public static final String BOXED_SHORT_CLASSNAME         = "java.lang.Short";
     public static final String BIGDECIMAL_CLASSNAME          = "java.math.BigDecimal";
     public static final String BIGINTEGER_CLASSNAME          = "java.math.BigInteger";
     public static final String CALENDAR_CLASSNAME            = "java.util.Calendar";
     public static final String DATE_CLASSNAME                = "java.util.Date";
     public static final String STRING_CLASSNAME              = "java.lang.String";
     public static final String STRING_ARRAY_CLASSNAME        = STRING_CLASSNAME+BRACKETS;
     public static final String QNAME_CLASSNAME               = "javax.xml.namespace.QName";
     public static final String VOID_CLASSNAME                = "void";
     public static final String OBJECT_CLASSNAME              = "java.lang.Object";
     public static final String SOAPELEMENT_CLASSNAME         = "javax.xml.soap.SOAPElement";
     public static final String IMAGE_CLASSNAME               = "java.awt.Image";
     public static final String MIME_MULTIPART_CLASSNAME      = "javax.mail.internet.MimeMultipart";
     public static final String SOURCE_CLASSNAME              = "javax.xml.transform.Source";
     public static final String DATA_HANDLER_CLASSNAME        = "javax.activation.DataHandler";
     public static final String URI_CLASSNAME                 = "java.net.URI";
//     public static final String URI_CLASSNAME                  = "java.lang.String";
     // Collections
     public static final String COLLECTION_CLASSNAME          = "java.util.Collection";
     public static final String LIST_CLASSNAME                = "java.util.List";
     public static final String SET_CLASSNAME                 = "java.util.Set";
     public static final String VECTOR_CLASSNAME              = "java.util.Vector";
     public static final String STACK_CLASSNAME               = "java.util.Stack";
     public static final String LINKED_LIST_CLASSNAME         = "java.util.LinkedList";
     public static final String ARRAY_LIST_CLASSNAME          = "java.util.ArrayList";
     public static final String HASH_SET_CLASSNAME            = "java.util.HashSet";
     public static final String TREE_SET_CLASSNAME            = "java.util.TreeSet";

     // Maps
     public static final String MAP_CLASSNAME                 = "java.util.Map";
     public static final String HASH_MAP_CLASSNAME            = "java.util.HashMap";
     public static final String TREE_MAP_CLASSNAME            = "java.util.TreeMap";
     public static final String HASHTABLE_CLASSNAME           = "java.util.Hashtable";
     public static final String PROPERTIES_CLASSNAME          = "java.util.Properties";
//     public static final String WEAK_HASH_MAP_CLASSNAME       = "java.util.WeakHashMap";
     public static final String JAX_WS_MAP_ENTRY_CLASSNAME   = "org.jboss.com.sun.xml.ws.encoding.soap.JAXWSMapEntry";

}
