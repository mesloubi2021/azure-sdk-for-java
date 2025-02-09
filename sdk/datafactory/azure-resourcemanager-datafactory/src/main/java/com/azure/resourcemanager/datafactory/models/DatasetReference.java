// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Dataset reference type. */
@Fluent
public final class DatasetReference {
    /*
     * Dataset reference type.
     */
    @JsonProperty(value = "type", required = true)
    private String type = "DatasetReference";

    /*
     * Reference dataset name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /*
     * Arguments for dataset.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> parameters;

    /** Creates an instance of DatasetReference class. */
    public DatasetReference() {
        type = "DatasetReference";
    }

    /**
     * Get the type property: Dataset reference type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Dataset reference type.
     *
     * @param type the type value to set.
     * @return the DatasetReference object itself.
     */
    public DatasetReference withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: Reference dataset name.
     *
     * @return the referenceName value.
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference dataset name.
     *
     * @param referenceName the referenceName value to set.
     * @return the DatasetReference object itself.
     */
    public DatasetReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get the parameters property: Arguments for dataset.
     *
     * @return the parameters value.
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Arguments for dataset.
     *
     * @param parameters the parameters value to set.
     * @return the DatasetReference object itself.
     */
    public DatasetReference withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (referenceName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property referenceName in model DatasetReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatasetReference.class);
}
