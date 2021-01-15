// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Query filter option for listing runs. */
@Fluent
public final class RunQueryFilter {
    /*
     * Parameter name to be used for filter. The allowed operands to query
     * pipeline runs are PipelineName, RunStart, RunEnd and Status; to query
     * activity runs are ActivityName, ActivityRunStart, ActivityRunEnd,
     * ActivityType and Status, and to query trigger runs are TriggerName,
     * TriggerRunTimestamp and Status.
     */
    @JsonProperty(value = "operand", required = true)
    private RunQueryFilterOperand operand;

    /*
     * Operator to be used for filter.
     */
    @JsonProperty(value = "operator", required = true)
    private RunQueryFilterOperator operator;

    /*
     * List of filter values.
     */
    @JsonProperty(value = "values", required = true)
    private List<String> values;

    /**
     * Get the operand property: Parameter name to be used for filter. The allowed operands to query pipeline runs are
     * PipelineName, RunStart, RunEnd and Status; to query activity runs are ActivityName, ActivityRunStart,
     * ActivityRunEnd, ActivityType and Status, and to query trigger runs are TriggerName, TriggerRunTimestamp and
     * Status.
     *
     * @return the operand value.
     */
    public RunQueryFilterOperand getOperand() {
        return this.operand;
    }

    /**
     * Set the operand property: Parameter name to be used for filter. The allowed operands to query pipeline runs are
     * PipelineName, RunStart, RunEnd and Status; to query activity runs are ActivityName, ActivityRunStart,
     * ActivityRunEnd, ActivityType and Status, and to query trigger runs are TriggerName, TriggerRunTimestamp and
     * Status.
     *
     * @param operand the operand value to set.
     * @return the RunQueryFilter object itself.
     */
    public RunQueryFilter setOperand(RunQueryFilterOperand operand) {
        this.operand = operand;
        return this;
    }

    /**
     * Get the operator property: Operator to be used for filter.
     *
     * @return the operator value.
     */
    public RunQueryFilterOperator getOperator() {
        return this.operator;
    }

    /**
     * Set the operator property: Operator to be used for filter.
     *
     * @param operator the operator value to set.
     * @return the RunQueryFilter object itself.
     */
    public RunQueryFilter setOperator(RunQueryFilterOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the values property: List of filter values.
     *
     * @return the values value.
     */
    public List<String> getValues() {
        return this.values;
    }

    /**
     * Set the values property: List of filter values.
     *
     * @param values the values value to set.
     * @return the RunQueryFilter object itself.
     */
    public RunQueryFilter setValues(List<String> values) {
        this.values = values;
        return this;
    }
}
