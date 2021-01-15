// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresql.fluent.models.PerformanceTierPropertiesInner;

/** An instance of this class provides access to all the operations defined in LocationBasedPerformanceTiersClient. */
public interface LocationBasedPerformanceTiersClient {
    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of performance tiers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PerformanceTierPropertiesInner> list(String locationName);

    /**
     * List all the performance tiers at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of performance tiers.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PerformanceTierPropertiesInner> list(String locationName, Context context);
}
