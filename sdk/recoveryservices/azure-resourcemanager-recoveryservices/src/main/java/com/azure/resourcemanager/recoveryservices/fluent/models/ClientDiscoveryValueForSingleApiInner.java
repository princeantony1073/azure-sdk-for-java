// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryDisplay;
import com.azure.resourcemanager.recoveryservices.models.ClientDiscoveryForProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Available operation details. */
@Fluent
public final class ClientDiscoveryValueForSingleApiInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClientDiscoveryValueForSingleApiInner.class);

    /*
     * Name of the Operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Contains the localized display information for this particular operation
     */
    @JsonProperty(value = "display")
    private ClientDiscoveryDisplay display;

    /*
     * The intended executor of the operation;governs the display of the
     * operation in the RBAC UX and the audit logs UX
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * ShoeBox properties for the given operation.
     */
    @JsonProperty(value = "properties")
    private ClientDiscoveryForProperties properties;

    /**
     * Get the name property: Name of the Operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Operation.
     *
     * @param name the name value to set.
     * @return the ClientDiscoveryValueForSingleApiInner object itself.
     */
    public ClientDiscoveryValueForSingleApiInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: Contains the localized display information for this particular operation.
     *
     * @return the display value.
     */
    public ClientDiscoveryDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Contains the localized display information for this particular operation.
     *
     * @param display the display value to set.
     * @return the ClientDiscoveryValueForSingleApiInner object itself.
     */
    public ClientDiscoveryValueForSingleApiInner withDisplay(ClientDiscoveryDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The intended executor of the operation;governs the display of the operation in the RBAC
     * UX and the audit logs UX.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The intended executor of the operation;governs the display of the operation in the RBAC
     * UX and the audit logs UX.
     *
     * @param origin the origin value to set.
     * @return the ClientDiscoveryValueForSingleApiInner object itself.
     */
    public ClientDiscoveryValueForSingleApiInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: ShoeBox properties for the given operation.
     *
     * @return the properties value.
     */
    public ClientDiscoveryForProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: ShoeBox properties for the given operation.
     *
     * @param properties the properties value to set.
     * @return the ClientDiscoveryValueForSingleApiInner object itself.
     */
    public ClientDiscoveryValueForSingleApiInner withProperties(ClientDiscoveryForProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
