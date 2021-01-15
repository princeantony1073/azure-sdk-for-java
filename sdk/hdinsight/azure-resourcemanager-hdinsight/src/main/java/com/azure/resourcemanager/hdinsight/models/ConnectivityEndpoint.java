// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The connectivity properties. */
@Fluent
public final class ConnectivityEndpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectivityEndpoint.class);

    /*
     * The name of the endpoint.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The protocol of the endpoint.
     */
    @JsonProperty(value = "protocol")
    private String protocol;

    /*
     * The location of the endpoint.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The port to connect to.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the name property: The name of the endpoint.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the endpoint.
     *
     * @param name the name value to set.
     * @return the ConnectivityEndpoint object itself.
     */
    public ConnectivityEndpoint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the protocol property: The protocol of the endpoint.
     *
     * @return the protocol value.
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol of the endpoint.
     *
     * @param protocol the protocol value to set.
     * @return the ConnectivityEndpoint object itself.
     */
    public ConnectivityEndpoint withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the location property: The location of the endpoint.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the endpoint.
     *
     * @param location the location value to set.
     * @return the ConnectivityEndpoint object itself.
     */
    public ConnectivityEndpoint withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the port property: The port to connect to.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port to connect to.
     *
     * @param port the port value to set.
     * @return the ConnectivityEndpoint object itself.
     */
    public ConnectivityEndpoint withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
