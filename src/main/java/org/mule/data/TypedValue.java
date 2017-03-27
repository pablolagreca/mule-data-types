/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.data;

import static java.util.Objects.requireNonNull;

/**
 * DTO for {@link org.mule.runtime.api.metadata.TypedValue}.
 *
 * @since 1.0
 */
public class TypedValue {

    private DataType dataType;

    /**
     * Null only when dataType.type is a Message
     */
    private byte[] content;

    /**
     * Creates an instance of the DTO.
     *
     * @param dataType {@link DataType} that defines the type of the content.
     * @param content content as {@code byte[]}.
     */
    public TypedValue(DataType dataType, byte[] content) {
        requireNonNull(dataType, "dataType cannot be null");
        requireNonNull(dataType, "content cannot be null");

        this.dataType = dataType;
        this.content = content;
    }

    public DataType getDataType() {
        return dataType;
    }

    public byte[] getContent() {
        return content;
    }

}
