// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LoadBalancerSkuTier. */
public final class LoadBalancerSkuTier extends ExpandableStringEnum<LoadBalancerSkuTier> {
    /** Static value Regional for LoadBalancerSkuTier. */
    public static final LoadBalancerSkuTier REGIONAL = fromString("Regional");

    /** Static value Global for LoadBalancerSkuTier. */
    public static final LoadBalancerSkuTier GLOBAL = fromString("Global");

    /**
     * Creates or finds a LoadBalancerSkuTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoadBalancerSkuTier.
     */
    @JsonCreator
    public static LoadBalancerSkuTier fromString(String name) {
        return fromString(name, LoadBalancerSkuTier.class);
    }

    /** @return known LoadBalancerSkuTier values. */
    public static Collection<LoadBalancerSkuTier> values() {
        return values(LoadBalancerSkuTier.class);
    }
}
