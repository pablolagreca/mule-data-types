/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.data;

import static java.util.Objects.requireNonNull;

/**
 * DTO for {@link org.mule.runtime.api.message.Message}.
 *
 * @since 1.0
 */
public class Message {

  private TypedValue attributes;
  private TypedValue payload;

  /**
   * Creates an instance of the DTO.
   *
   * @param attributes {@link TypedValue} for the attributes. Non null.
   * @param payload {@link TypedValue} for the payload. Non null.
   */
  public Message(TypedValue attributes, TypedValue payload) {
    requireNonNull(attributes, "attributes cannot be null");
    requireNonNull(attributes, "payload cannot be null");

    this.attributes = attributes;
    this.payload = payload;
  }

  public TypedValue getAttributes() {
    return attributes;
  }

  public TypedValue getPayload() {
    return payload;
  }

}
