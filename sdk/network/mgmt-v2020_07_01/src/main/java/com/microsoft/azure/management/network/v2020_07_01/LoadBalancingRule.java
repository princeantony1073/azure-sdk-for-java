/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_07_01.implementation.LoadBalancingRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;

/**
 * Type representing LoadBalancingRule.
 */
public interface LoadBalancingRule extends HasInner<LoadBalancingRuleInner>, Indexable, Refreshable<LoadBalancingRule>, HasManager<NetworkManager> {
    /**
     * @return the backendAddressPool value.
     */
    SubResource backendAddressPool();

    /**
     * @return the backendPort value.
     */
    Integer backendPort();

    /**
     * @return the disableOutboundSnat value.
     */
    Boolean disableOutboundSnat();

    /**
     * @return the enableFloatingIP value.
     */
    Boolean enableFloatingIP();

    /**
     * @return the enableTcpReset value.
     */
    Boolean enableTcpReset();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the frontendIPConfiguration value.
     */
    SubResource frontendIPConfiguration();

    /**
     * @return the frontendPort value.
     */
    int frontendPort();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * @return the loadDistribution value.
     */
    LoadDistribution loadDistribution();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the probe value.
     */
    SubResource probe();

    /**
     * @return the protocol value.
     */
    TransportProtocol protocol();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

}
