/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AzureFirewallNatRCActionType.
 */
public final class AzureFirewallNatRCActionType extends ExpandableStringEnum<AzureFirewallNatRCActionType> {
    /** Static value Snat for AzureFirewallNatRCActionType. */
    public static final AzureFirewallNatRCActionType SNAT = fromString("Snat");

    /** Static value Dnat for AzureFirewallNatRCActionType. */
    public static final AzureFirewallNatRCActionType DNAT = fromString("Dnat");

    /**
     * Creates or finds a AzureFirewallNatRCActionType from its string representation.
     * @param name a name to look for
     * @return the corresponding AzureFirewallNatRCActionType
     */
    @JsonCreator
    public static AzureFirewallNatRCActionType fromString(String name) {
        return fromString(name, AzureFirewallNatRCActionType.class);
    }

    /**
     * @return known AzureFirewallNatRCActionType values
     */
    public static Collection<AzureFirewallNatRCActionType> values() {
        return values(AzureFirewallNatRCActionType.class);
    }
}
