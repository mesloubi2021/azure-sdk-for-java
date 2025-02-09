// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response containing Id's for the worker, job, and assignment from an accepted offer. */
@Fluent
public final class AcceptJobOfferResultInternal {
    /*
     * The assignment Id that assigns a worker that has accepted an offer to a job.
     */
    @JsonProperty(value = "assignmentId", required = true)
    private String assignmentId;

    /*
     * The Id of the job assigned.
     */
    @JsonProperty(value = "jobId", required = true)
    private String jobId;

    /*
     * The Id of the worker that has been assigned this job.
     */
    @JsonProperty(value = "workerId", required = true)
    private String workerId;

    /** Creates an instance of AcceptJobOfferResultInternal class. */
    public AcceptJobOfferResultInternal() {}

    /**
     * Get the assignmentId property: The assignment Id that assigns a worker that has accepted an offer to a job.
     *
     * @return the assignmentId value.
     */
    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * Set the assignmentId property: The assignment Id that assigns a worker that has accepted an offer to a job.
     *
     * @param assignmentId the assignmentId value to set.
     * @return the AcceptJobOfferResultInternal object itself.
     */
    public AcceptJobOfferResultInternal setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
        return this;
    }

    /**
     * Get the jobId property: The Id of the job assigned.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: The Id of the job assigned.
     *
     * @param jobId the jobId value to set.
     * @return the AcceptJobOfferResultInternal object itself.
     */
    public AcceptJobOfferResultInternal setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the workerId property: The Id of the worker that has been assigned this job.
     *
     * @return the workerId value.
     */
    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * Set the workerId property: The Id of the worker that has been assigned this job.
     *
     * @param workerId the workerId value to set.
     * @return the AcceptJobOfferResultInternal object itself.
     */
    public AcceptJobOfferResultInternal setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }
}
