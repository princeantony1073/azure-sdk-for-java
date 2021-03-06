// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MediaServiceIdentity model. */
@Fluent
public class MediaServiceIdentity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MediaServiceIdentity.class);

    /*
     * The identity type.
     */
    @JsonProperty(value = "type", required = true)
    private ManagedIdentityType type;

    /*
     * The Principal ID of the identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The Tenant ID of the identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Get the type property: The identity type.
     *
     * @return the type value.
     */
    public ManagedIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type.
     *
     * @param type the type value to set.
     * @return the MediaServiceIdentity object itself.
     */
    public MediaServiceIdentity withType(ManagedIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: The Principal ID of the identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The Tenant ID of the identity.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model MediaServiceIdentity"));
        }
    }
}
