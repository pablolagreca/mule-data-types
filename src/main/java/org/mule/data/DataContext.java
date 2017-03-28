/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.data;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the {@link Message} and the {@link TypedValue variables} associated with it.
 *
 * @since 1.0
 */
public class DataContext {

  private Message message;
  private List<TypedValue> variables = new ArrayList<>();

  /**
   * Creates an instance of the context.
   *
   * @param message {@link Message}
   * @param variables {@link List} of {@link Variables}
   */
  public DataContext(Message message, List<TypedValue> variables) {
    requireNonNull(message, "message cannot be null");
    requireNonNull(variables, "variables cannot be null");

    this.message = message;
    this.variables = variables;
  }

  public Message getMessage() {
    return this.message;
  }

  public List<TypedValue> getVariables() {
    return this.variables;
  }

}
