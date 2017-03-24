/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.data;

public class TypedValue
{

    private DataType dataType;
    /**
     * Null only when dataType.type is a Message
     */
    private byte[] content;
    /**
     * Not null only when dataType.type is a Message
     */
    private Message messageContent;

}
