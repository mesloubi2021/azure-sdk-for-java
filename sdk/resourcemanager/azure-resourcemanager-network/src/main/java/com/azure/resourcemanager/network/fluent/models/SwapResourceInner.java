// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.SwapResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SwapResource to represent slot type on the specified cloud service. */
@Fluent
public final class SwapResourceInner {
    /*
     * Resource Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Swap resource properties
     */
    @JsonProperty(value = "properties")
    private SwapResourceProperties properties;

    /** Creates an instance of SwapResourceInner class. */
    public SwapResourceInner() {
    }

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the properties property: Swap resource properties.
     *
     * @return the properties value.
     */
    public SwapResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Swap resource properties.
     *
     * @param properties the properties value to set.
     * @return the SwapResourceInner object itself.
     */
    public SwapResourceInner withProperties(SwapResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
