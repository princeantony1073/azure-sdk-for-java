/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application gateway probe health response match.
 */
public class ApplicationGatewayProbeHealthResponseMatch {
    /**
     * Body that must be contained in the health response. Default value is
     * empty.
     */
    @JsonProperty(value = "body")
    private String body;

    /**
     * Allowed ranges of healthy status codes. Default range of healthy status
     * codes is 200-399.
     */
    @JsonProperty(value = "statusCodes")
    private List<String> statusCodes;

    /**
     * Get body that must be contained in the health response. Default value is empty.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set body that must be contained in the health response. Default value is empty.
     *
     * @param body the body value to set
     * @return the ApplicationGatewayProbeHealthResponseMatch object itself.
     */
    public ApplicationGatewayProbeHealthResponseMatch withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get allowed ranges of healthy status codes. Default range of healthy status codes is 200-399.
     *
     * @return the statusCodes value
     */
    public List<String> statusCodes() {
        return this.statusCodes;
    }

    /**
     * Set allowed ranges of healthy status codes. Default range of healthy status codes is 200-399.
     *
     * @param statusCodes the statusCodes value to set
     * @return the ApplicationGatewayProbeHealthResponseMatch object itself.
     */
    public ApplicationGatewayProbeHealthResponseMatch withStatusCodes(List<String> statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }

}
