/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in InboundSecurityRuleOperations.
 */
public class InboundSecurityRuleOperationsInner {
    /** The Retrofit service to perform REST calls. */
    private InboundSecurityRuleOperationsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of InboundSecurityRuleOperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public InboundSecurityRuleOperationsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(InboundSecurityRuleOperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for InboundSecurityRuleOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface InboundSecurityRuleOperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_07_01.InboundSecurityRuleOperations createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkVirtualAppliances/{networkVirtualApplianceName}/inboundSecurityRules/{ruleCollectionName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("networkVirtualApplianceName") String networkVirtualApplianceName, @Path("ruleCollectionName") String ruleCollectionName, @Path("subscriptionId") String subscriptionId, @Body InboundSecurityRuleInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_07_01.InboundSecurityRuleOperations beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkVirtualAppliances/{networkVirtualApplianceName}/inboundSecurityRules/{ruleCollectionName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("networkVirtualApplianceName") String networkVirtualApplianceName, @Path("ruleCollectionName") String ruleCollectionName, @Path("subscriptionId") String subscriptionId, @Body InboundSecurityRuleInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InboundSecurityRuleInner object if successful.
     */
    public InboundSecurityRuleInner createOrUpdate(String resourceGroupName, String networkVirtualApplianceName, String ruleCollectionName, InboundSecurityRuleInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters).toBlocking().last().body();
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InboundSecurityRuleInner> createOrUpdateAsync(String resourceGroupName, String networkVirtualApplianceName, String ruleCollectionName, InboundSecurityRuleInner parameters, final ServiceCallback<InboundSecurityRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters), serviceCallback);
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<InboundSecurityRuleInner> createOrUpdateAsync(String resourceGroupName, String networkVirtualApplianceName, String ruleCollectionName, InboundSecurityRuleInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters).map(new Func1<ServiceResponse<InboundSecurityRuleInner>, InboundSecurityRuleInner>() {
            @Override
            public InboundSecurityRuleInner call(ServiceResponse<InboundSecurityRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<InboundSecurityRuleInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String networkVirtualApplianceName, String ruleCollectionName, InboundSecurityRuleInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (networkVirtualApplianceName == null) {
            throw new IllegalArgumentException("Parameter networkVirtualApplianceName is required and cannot be null.");
        }
        if (ruleCollectionName == null) {
            throw new IllegalArgumentException("Parameter ruleCollectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2020-07-01";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<InboundSecurityRuleInner>() { }.getType());
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InboundSecurityRuleInner object if successful.
     */
    public InboundSecurityRuleInner beginCreateOrUpdate(String resourceGroupName, String networkVirtualApplianceName, String ruleCollectionName, InboundSecurityRuleInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InboundSecurityRuleInner> beginCreateOrUpdateAsync(String resourceGroupName, String networkVirtualApplianceName, String ruleCollectionName, InboundSecurityRuleInner parameters, final ServiceCallback<InboundSecurityRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters), serviceCallback);
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InboundSecurityRuleInner object
     */
    public Observable<InboundSecurityRuleInner> beginCreateOrUpdateAsync(String resourceGroupName, String networkVirtualApplianceName, String ruleCollectionName, InboundSecurityRuleInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, parameters).map(new Func1<ServiceResponse<InboundSecurityRuleInner>, InboundSecurityRuleInner>() {
            @Override
            public InboundSecurityRuleInner call(ServiceResponse<InboundSecurityRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates the specified Network Virtual Appliance Inbound Security Rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkVirtualApplianceName The name of the Network Virtual Appliance.
     * @param ruleCollectionName The name of security rule collection.
     * @param parameters Parameters supplied to the create or update Network Virtual Appliance Inbound Security Rules operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InboundSecurityRuleInner object
     */
    public Observable<ServiceResponse<InboundSecurityRuleInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String networkVirtualApplianceName, String ruleCollectionName, InboundSecurityRuleInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (networkVirtualApplianceName == null) {
            throw new IllegalArgumentException("Parameter networkVirtualApplianceName is required and cannot be null.");
        }
        if (ruleCollectionName == null) {
            throw new IllegalArgumentException("Parameter ruleCollectionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2020-07-01";
        return service.beginCreateOrUpdate(resourceGroupName, networkVirtualApplianceName, ruleCollectionName, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InboundSecurityRuleInner>>>() {
                @Override
                public Observable<ServiceResponse<InboundSecurityRuleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InboundSecurityRuleInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InboundSecurityRuleInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<InboundSecurityRuleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InboundSecurityRuleInner>() { }.getType())
                .register(201, new TypeToken<InboundSecurityRuleInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
