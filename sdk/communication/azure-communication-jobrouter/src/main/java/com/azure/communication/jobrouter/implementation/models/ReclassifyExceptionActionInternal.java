// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** An action that modifies labels on a job and then reclassifies it. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("reclassify")
@Fluent
public final class ReclassifyExceptionActionInternal extends ExceptionActionInternal {
    /*
     * (optional) The new classification policy that will determine queue, priority and worker selectors.
     */
    @JsonProperty(value = "classificationPolicyId")
    private String classificationPolicyId;

    /*
     * (optional) Dictionary containing the labels to update (or add if not existing) in key-value pairs
     */
    @JsonProperty(value = "labelsToUpsert")
    private Map<String, Object> labelsToUpsert;

    /** Creates an instance of ReclassifyExceptionActionInternal class. */
    public ReclassifyExceptionActionInternal() {}

    /**
     * Get the classificationPolicyId property: (optional) The new classification policy that will determine queue,
     * priority and worker selectors.
     *
     * @return the classificationPolicyId value.
     */
    public String getClassificationPolicyId() {
        return this.classificationPolicyId;
    }

    /**
     * Set the classificationPolicyId property: (optional) The new classification policy that will determine queue,
     * priority and worker selectors.
     *
     * @param classificationPolicyId the classificationPolicyId value to set.
     * @return the ReclassifyExceptionActionInternal object itself.
     */
    public ReclassifyExceptionActionInternal setClassificationPolicyId(String classificationPolicyId) {
        this.classificationPolicyId = classificationPolicyId;
        return this;
    }

    /**
     * Get the labelsToUpsert property: (optional) Dictionary containing the labels to update (or add if not existing)
     * in key-value pairs.
     *
     * @return the labelsToUpsert value.
     */
    public Map<String, Object> getLabelsToUpsert() {
        return this.labelsToUpsert;
    }

    /**
     * Set the labelsToUpsert property: (optional) Dictionary containing the labels to update (or add if not existing)
     * in key-value pairs.
     *
     * @param labelsToUpsert the labelsToUpsert value to set.
     * @return the ReclassifyExceptionActionInternal object itself.
     */
    public ReclassifyExceptionActionInternal setLabelsToUpsert(Map<String, Object> labelsToUpsert) {
        this.labelsToUpsert = labelsToUpsert;
        return this;
    }
}
