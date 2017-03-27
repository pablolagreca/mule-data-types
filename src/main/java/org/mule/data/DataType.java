/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.data;

import static java.util.Objects.requireNonNull;

/**
 * DTO for {@link org.mule.runtime.api.metadata.DataType}.
 *
 * @since 1.0
 */
public class DataType {

    private String type;
    private String mediaType;

    /**
     * Creates an instance of the DTO.
     *
     * @param type the {@link Class} that defines the type. Non null.
     * @param mediaType the media type from {@link org.mule.runtime.api.metadata.DataType} as {@link String}. Non null.
     */
    public DataType(String type, String mediaType) {
        requireNonNull(type, "type cannot be null");
        requireNonNull(mediaType, "mediaType cannot be null");

        this.type = type;
        this.mediaType = mediaType;
    }

    public String getType() {
        return type;
    }

    public String getMediaType() {
        return mediaType;
    }

}
