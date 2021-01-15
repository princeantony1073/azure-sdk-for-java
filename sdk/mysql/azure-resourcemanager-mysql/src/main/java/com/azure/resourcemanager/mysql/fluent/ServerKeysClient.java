// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mysql.fluent.models.ServerKeyInner;

/** An instance of this class provides access to all the operations defined in ServerKeysClient. */
public interface ServerKeysClient {
    /**
     * Gets a list of Server keys.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Server keys.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerKeyInner> list(String resourceGroupName, String serverName);

    /**
     * Gets a list of Server keys.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Server keys.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerKeyInner> list(String resourceGroupName, String serverName, Context context);

    /**
     * Gets a MySQL Server key.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MySQL Server key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerKeyInner get(String resourceGroupName, String serverName, String keyName);

    /**
     * Gets a MySQL Server key.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MySQL Server key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerKeyInner> getWithResponse(
        String resourceGroupName, String serverName, String keyName, Context context);

    /**
     * Creates or updates a MySQL Server key.
     *
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be operated on (updated or created).
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The requested MySQL Server key resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MySQL Server key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerKeyInner>, ServerKeyInner> beginCreateOrUpdate(
        String serverName, String keyName, String resourceGroupName, ServerKeyInner parameters);

    /**
     * Creates or updates a MySQL Server key.
     *
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be operated on (updated or created).
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The requested MySQL Server key resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MySQL Server key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerKeyInner>, ServerKeyInner> beginCreateOrUpdate(
        String serverName, String keyName, String resourceGroupName, ServerKeyInner parameters, Context context);

    /**
     * Creates or updates a MySQL Server key.
     *
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be operated on (updated or created).
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The requested MySQL Server key resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MySQL Server key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerKeyInner createOrUpdate(
        String serverName, String keyName, String resourceGroupName, ServerKeyInner parameters);

    /**
     * Creates or updates a MySQL Server key.
     *
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be operated on (updated or created).
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param parameters The requested MySQL Server key resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a MySQL Server key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerKeyInner createOrUpdate(
        String serverName, String keyName, String resourceGroupName, ServerKeyInner parameters, Context context);

    /**
     * Deletes the MySQL Server key with the given name.
     *
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be deleted.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String serverName, String keyName, String resourceGroupName);

    /**
     * Deletes the MySQL Server key with the given name.
     *
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be deleted.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String serverName, String keyName, String resourceGroupName, Context context);

    /**
     * Deletes the MySQL Server key with the given name.
     *
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be deleted.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String serverName, String keyName, String resourceGroupName);

    /**
     * Deletes the MySQL Server key with the given name.
     *
     * @param serverName The name of the server.
     * @param keyName The name of the MySQL Server key to be deleted.
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String serverName, String keyName, String resourceGroupName, Context context);
}
