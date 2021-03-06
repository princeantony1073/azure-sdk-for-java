/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The workflow run trigger.
 */
public class WorkflowRunTrigger {
    /**
     * Gets the name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets the inputs.
     */
    @JsonProperty(value = "inputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object inputs;

    /**
     * Gets the link to inputs.
     */
    @JsonProperty(value = "inputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink inputsLink;

    /**
     * Gets the outputs.
     */
    @JsonProperty(value = "outputs", access = JsonProperty.Access.WRITE_ONLY)
    private Object outputs;

    /**
     * Gets the link to outputs.
     */
    @JsonProperty(value = "outputsLink", access = JsonProperty.Access.WRITE_ONLY)
    private ContentLink outputsLink;

    /**
     * Gets the scheduled time.
     */
    @JsonProperty(value = "scheduledTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime scheduledTime;

    /**
     * Gets the start time.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * Gets the end time.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * Gets the tracking id.
     */
    @JsonProperty(value = "trackingId", access = JsonProperty.Access.WRITE_ONLY)
    private String trackingId;

    /**
     * The run correlation.
     */
    @JsonProperty(value = "correlation")
    private Correlation correlation;

    /**
     * Gets the code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Gets the status. Possible values include: 'NotSpecified', 'Paused',
     * 'Running', 'Waiting', 'Succeeded', 'Skipped', 'Suspended', 'Cancelled',
     * 'Failed', 'Faulted', 'TimedOut', 'Aborted', 'Ignored'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private WorkflowStatus status;

    /**
     * Gets the error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private Object error;

    /**
     * Gets the tracked properties.
     */
    @JsonProperty(value = "trackedProperties", access = JsonProperty.Access.WRITE_ONLY)
    private Object trackedProperties;

    /**
     * Get gets the name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get gets the inputs.
     *
     * @return the inputs value
     */
    public Object inputs() {
        return this.inputs;
    }

    /**
     * Get gets the link to inputs.
     *
     * @return the inputsLink value
     */
    public ContentLink inputsLink() {
        return this.inputsLink;
    }

    /**
     * Get gets the outputs.
     *
     * @return the outputs value
     */
    public Object outputs() {
        return this.outputs;
    }

    /**
     * Get gets the link to outputs.
     *
     * @return the outputsLink value
     */
    public ContentLink outputsLink() {
        return this.outputsLink;
    }

    /**
     * Get gets the scheduled time.
     *
     * @return the scheduledTime value
     */
    public DateTime scheduledTime() {
        return this.scheduledTime;
    }

    /**
     * Get gets the start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get gets the end time.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get gets the tracking id.
     *
     * @return the trackingId value
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Get the run correlation.
     *
     * @return the correlation value
     */
    public Correlation correlation() {
        return this.correlation;
    }

    /**
     * Set the run correlation.
     *
     * @param correlation the correlation value to set
     * @return the WorkflowRunTrigger object itself.
     */
    public WorkflowRunTrigger withCorrelation(Correlation correlation) {
        this.correlation = correlation;
        return this;
    }

    /**
     * Get gets the code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get gets the status. Possible values include: 'NotSpecified', 'Paused', 'Running', 'Waiting', 'Succeeded', 'Skipped', 'Suspended', 'Cancelled', 'Failed', 'Faulted', 'TimedOut', 'Aborted', 'Ignored'.
     *
     * @return the status value
     */
    public WorkflowStatus status() {
        return this.status;
    }

    /**
     * Get gets the error.
     *
     * @return the error value
     */
    public Object error() {
        return this.error;
    }

    /**
     * Get gets the tracked properties.
     *
     * @return the trackedProperties value
     */
    public Object trackedProperties() {
        return this.trackedProperties;
    }

}
