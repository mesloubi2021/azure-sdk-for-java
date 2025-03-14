// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters that define the configuration of traffic analytics. */
@Fluent
public final class TrafficAnalyticsConfigurationProperties {
    /*
     * Flag to enable/disable traffic analytics.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The resource guid of the attached workspace.
     */
    @JsonProperty(value = "workspaceId")
    private String workspaceId;

    /*
     * The location of the attached workspace.
     */
    @JsonProperty(value = "workspaceRegion")
    private String workspaceRegion;

    /*
     * Resource Id of the attached workspace.
     */
    @JsonProperty(value = "workspaceResourceId")
    private String workspaceResourceId;

    /*
     * The interval in minutes which would decide how frequently TA service should do flow analytics.
     */
    @JsonProperty(value = "trafficAnalyticsInterval")
    private Integer trafficAnalyticsInterval;

    /** Creates an instance of TrafficAnalyticsConfigurationProperties class. */
    public TrafficAnalyticsConfigurationProperties() {
    }

    /**
     * Get the enabled property: Flag to enable/disable traffic analytics.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Flag to enable/disable traffic analytics.
     *
     * @param enabled the enabled value to set.
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the workspaceId property: The resource guid of the attached workspace.
     *
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The resource guid of the attached workspace.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the workspaceRegion property: The location of the attached workspace.
     *
     * @return the workspaceRegion value.
     */
    public String workspaceRegion() {
        return this.workspaceRegion;
    }

    /**
     * Set the workspaceRegion property: The location of the attached workspace.
     *
     * @param workspaceRegion the workspaceRegion value to set.
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withWorkspaceRegion(String workspaceRegion) {
        this.workspaceRegion = workspaceRegion;
        return this;
    }

    /**
     * Get the workspaceResourceId property: Resource Id of the attached workspace.
     *
     * @return the workspaceResourceId value.
     */
    public String workspaceResourceId() {
        return this.workspaceResourceId;
    }

    /**
     * Set the workspaceResourceId property: Resource Id of the attached workspace.
     *
     * @param workspaceResourceId the workspaceResourceId value to set.
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withWorkspaceResourceId(String workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
        return this;
    }

    /**
     * Get the trafficAnalyticsInterval property: The interval in minutes which would decide how frequently TA service
     * should do flow analytics.
     *
     * @return the trafficAnalyticsInterval value.
     */
    public Integer trafficAnalyticsInterval() {
        return this.trafficAnalyticsInterval;
    }

    /**
     * Set the trafficAnalyticsInterval property: The interval in minutes which would decide how frequently TA service
     * should do flow analytics.
     *
     * @param trafficAnalyticsInterval the trafficAnalyticsInterval value to set.
     * @return the TrafficAnalyticsConfigurationProperties object itself.
     */
    public TrafficAnalyticsConfigurationProperties withTrafficAnalyticsInterval(Integer trafficAnalyticsInterval) {
        this.trafficAnalyticsInterval = trafficAnalyticsInterval;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
