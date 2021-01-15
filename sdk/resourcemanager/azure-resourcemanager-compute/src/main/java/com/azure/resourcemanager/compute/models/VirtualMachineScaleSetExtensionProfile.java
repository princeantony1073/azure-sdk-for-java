// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineScaleSetExtensionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machine scale set extension profile. */
@Fluent
public final class VirtualMachineScaleSetExtensionProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetExtensionProfile.class);

    /*
     * The virtual machine scale set child extension resources.
     */
    @JsonProperty(value = "extensions")
    private List<VirtualMachineScaleSetExtensionInner> extensions;

    /*
     * Specifies the time alloted for all extensions to start. The time
     * duration should be between 15 minutes and 120 minutes (inclusive) and
     * should be specified in ISO 8601 format. The default value is 90 minutes
     * (PT1H30M). <br><br> Minimum api-version: 2020-06-01
     */
    @JsonProperty(value = "extensionsTimeBudget")
    private String extensionsTimeBudget;

    /**
     * Get the extensions property: The virtual machine scale set child extension resources.
     *
     * @return the extensions value.
     */
    public List<VirtualMachineScaleSetExtensionInner> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The virtual machine scale set child extension resources.
     *
     * @param extensions the extensions value to set.
     * @return the VirtualMachineScaleSetExtensionProfile object itself.
     */
    public VirtualMachineScaleSetExtensionProfile withExtensions(
        List<VirtualMachineScaleSetExtensionInner> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the extensionsTimeBudget property: Specifies the time alloted for all extensions to start. The time duration
     * should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default
     * value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01.
     *
     * @return the extensionsTimeBudget value.
     */
    public String extensionsTimeBudget() {
        return this.extensionsTimeBudget;
    }

    /**
     * Set the extensionsTimeBudget property: Specifies the time alloted for all extensions to start. The time duration
     * should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default
     * value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01.
     *
     * @param extensionsTimeBudget the extensionsTimeBudget value to set.
     * @return the VirtualMachineScaleSetExtensionProfile object itself.
     */
    public VirtualMachineScaleSetExtensionProfile withExtensionsTimeBudget(String extensionsTimeBudget) {
        this.extensionsTimeBudget = extensionsTimeBudget;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
    }
}
