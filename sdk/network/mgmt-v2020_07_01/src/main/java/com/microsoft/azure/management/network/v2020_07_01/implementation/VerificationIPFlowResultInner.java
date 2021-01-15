/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.management.network.v2020_07_01.Access;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Results of IP flow verification on the target resource.
 */
public class VerificationIPFlowResultInner {
    /**
     * Indicates whether the traffic is allowed or denied. Possible values
     * include: 'Allow', 'Deny'.
     */
    @JsonProperty(value = "access")
    private Access access;

    /**
     * Name of the rule. If input is not matched against any security rule, it
     * is not displayed.
     */
    @JsonProperty(value = "ruleName")
    private String ruleName;

    /**
     * Get indicates whether the traffic is allowed or denied. Possible values include: 'Allow', 'Deny'.
     *
     * @return the access value
     */
    public Access access() {
        return this.access;
    }

    /**
     * Set indicates whether the traffic is allowed or denied. Possible values include: 'Allow', 'Deny'.
     *
     * @param access the access value to set
     * @return the VerificationIPFlowResultInner object itself.
     */
    public VerificationIPFlowResultInner withAccess(Access access) {
        this.access = access;
        return this;
    }

    /**
     * Get name of the rule. If input is not matched against any security rule, it is not displayed.
     *
     * @return the ruleName value
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set name of the rule. If input is not matched against any security rule, it is not displayed.
     *
     * @param ruleName the ruleName value to set
     * @return the VerificationIPFlowResultInner object itself.
     */
    public VerificationIPFlowResultInner withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

}
