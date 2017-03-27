/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.data;

import static java.util.Objects.requireNonNull;

/**
 * Describes a Mule component by namespace and name.
 *
 * @since 1.0
 */
public class ComponentIdentiifier {

  private String namespace;
  private String name;

  /**
   * Creates an instance of the identifer.
   *
   * @param namespace defines the namespace of component. Non null.
   * @param name defines the name of the component. Non null.
   */
  public ComponentIdentiifier(String namespace, String name) {
    requireNonNull(namespace, "namespace cannot be null");
    requireNonNull(name, "name cannot be null");

    this.namespace = namespace;
    this.name = name;
  }

  public String getNamespace() {
    return namespace;
  }

  public String getName() {
    return name;
  }

}
