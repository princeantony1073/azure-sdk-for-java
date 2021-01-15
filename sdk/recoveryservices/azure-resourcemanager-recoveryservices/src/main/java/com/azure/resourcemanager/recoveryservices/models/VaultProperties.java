// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the vault. */
@Fluent
public final class VaultProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VaultProperties.class);

    /*
     * Provisioning State.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Details for upgrading vault.
     */
    @JsonProperty(value = "upgradeDetails")
    private UpgradeDetails upgradeDetails;

    /*
     * List of private endpoint connection.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionVaultProperties> privateEndpointConnections;

    /*
     * Private endpoint state for backup.
     */
    @JsonProperty(value = "privateEndpointStateForBackup", access = JsonProperty.Access.WRITE_ONLY)
    private VaultPrivateEndpointState privateEndpointStateForBackup;

    /*
     * Private endpoint state for site recovery.
     */
    @JsonProperty(value = "privateEndpointStateForSiteRecovery", access = JsonProperty.Access.WRITE_ONLY)
    private VaultPrivateEndpointState privateEndpointStateForSiteRecovery;

    /**
     * Get the provisioningState property: Provisioning State.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the upgradeDetails property: Details for upgrading vault.
     *
     * @return the upgradeDetails value.
     */
    public UpgradeDetails upgradeDetails() {
        return this.upgradeDetails;
    }

    /**
     * Set the upgradeDetails property: Details for upgrading vault.
     *
     * @param upgradeDetails the upgradeDetails value to set.
     * @return the VaultProperties object itself.
     */
    public VaultProperties withUpgradeDetails(UpgradeDetails upgradeDetails) {
        this.upgradeDetails = upgradeDetails;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connection.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionVaultProperties> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the privateEndpointStateForBackup property: Private endpoint state for backup.
     *
     * @return the privateEndpointStateForBackup value.
     */
    public VaultPrivateEndpointState privateEndpointStateForBackup() {
        return this.privateEndpointStateForBackup;
    }

    /**
     * Get the privateEndpointStateForSiteRecovery property: Private endpoint state for site recovery.
     *
     * @return the privateEndpointStateForSiteRecovery value.
     */
    public VaultPrivateEndpointState privateEndpointStateForSiteRecovery() {
        return this.privateEndpointStateForSiteRecovery;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (upgradeDetails() != null) {
            upgradeDetails().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
