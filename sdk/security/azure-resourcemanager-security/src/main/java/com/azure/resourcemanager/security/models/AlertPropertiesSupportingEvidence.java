// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Changing set of properties depending on the supportingEvidence type. */
@Fluent
public final class AlertPropertiesSupportingEvidence {
    /*
     * Type of the supportingEvidence
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Changing set of properties depending on the supportingEvidence type.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of AlertPropertiesSupportingEvidence class. */
    public AlertPropertiesSupportingEvidence() {
    }

    /**
     * Get the type property: Type of the supportingEvidence.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the additionalProperties property: Changing set of properties depending on the supportingEvidence type.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Changing set of properties depending on the supportingEvidence type.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the AlertPropertiesSupportingEvidence object itself.
     */
    public AlertPropertiesSupportingEvidence withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
