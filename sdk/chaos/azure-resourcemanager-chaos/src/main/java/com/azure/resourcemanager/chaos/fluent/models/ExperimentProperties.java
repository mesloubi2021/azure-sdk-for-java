// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.chaos.models.Selector;
import com.azure.resourcemanager.chaos.models.Step;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Model that represents the Experiment properties model. */
@Fluent
public final class ExperimentProperties {
    /*
     * List of steps.
     */
    @JsonProperty(value = "steps", required = true)
    private List<Step> steps;

    /*
     * List of selectors.
     */
    @JsonProperty(value = "selectors", required = true)
    private List<Selector> selectors;

    /*
     * A boolean value that indicates if experiment should be started on creation or not.
     */
    @JsonProperty(value = "startOnCreation")
    private Boolean startOnCreation;

    /** Creates an instance of ExperimentProperties class. */
    public ExperimentProperties() {
    }

    /**
     * Get the steps property: List of steps.
     *
     * @return the steps value.
     */
    public List<Step> steps() {
        return this.steps;
    }

    /**
     * Set the steps property: List of steps.
     *
     * @param steps the steps value to set.
     * @return the ExperimentProperties object itself.
     */
    public ExperimentProperties withSteps(List<Step> steps) {
        this.steps = steps;
        return this;
    }

    /**
     * Get the selectors property: List of selectors.
     *
     * @return the selectors value.
     */
    public List<Selector> selectors() {
        return this.selectors;
    }

    /**
     * Set the selectors property: List of selectors.
     *
     * @param selectors the selectors value to set.
     * @return the ExperimentProperties object itself.
     */
    public ExperimentProperties withSelectors(List<Selector> selectors) {
        this.selectors = selectors;
        return this;
    }

    /**
     * Get the startOnCreation property: A boolean value that indicates if experiment should be started on creation or
     * not.
     *
     * @return the startOnCreation value.
     */
    public Boolean startOnCreation() {
        return this.startOnCreation;
    }

    /**
     * Set the startOnCreation property: A boolean value that indicates if experiment should be started on creation or
     * not.
     *
     * @param startOnCreation the startOnCreation value to set.
     * @return the ExperimentProperties object itself.
     */
    public ExperimentProperties withStartOnCreation(Boolean startOnCreation) {
        this.startOnCreation = startOnCreation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (steps() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property steps in model ExperimentProperties"));
        } else {
            steps().forEach(e -> e.validate());
        }
        if (selectors() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property selectors in model ExperimentProperties"));
        } else {
            selectors().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExperimentProperties.class);
}
