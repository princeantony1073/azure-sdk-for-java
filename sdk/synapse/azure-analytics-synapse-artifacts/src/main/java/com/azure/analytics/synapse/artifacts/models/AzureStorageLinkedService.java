// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The storage account linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureStorage")
@JsonFlatten
@Fluent
public class AzureStorageLinkedService extends LinkedService {
    /*
     * The connection string. It is mutually exclusive with sasUri property.
     * Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /*
     * The Azure key vault secret reference of accountKey in connection string.
     */
    @JsonProperty(value = "typeProperties.accountKey")
    private AzureKeyVaultSecretReference accountKey;

    /*
     * SAS URI of the Azure Storage resource. It is mutually exclusive with
     * connectionString property. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.sasUri")
    private Object sasUri;

    /*
     * The Azure key vault secret reference of sasToken in sas uri.
     */
    @JsonProperty(value = "typeProperties.sasToken")
    private AzureKeyVaultSecretReference sasToken;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private String encryptedCredential;

    /**
     * Get the connectionString property: The connection string. It is mutually exclusive with sasUri property. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. It is mutually exclusive with sasUri property. Type:
     * string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @return the accountKey value.
     */
    public AzureKeyVaultSecretReference getAccountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: The Azure key vault secret reference of accountKey in connection string.
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService setAccountKey(AzureKeyVaultSecretReference accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the sasUri property: SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @return the sasUri value.
     */
    public Object getSasUri() {
        return this.sasUri;
    }

    /**
     * Set the sasUri property: SAS URI of the Azure Storage resource. It is mutually exclusive with connectionString
     * property. Type: string, SecureString or AzureKeyVaultSecretReference.
     *
     * @param sasUri the sasUri value to set.
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService setSasUri(Object sasUri) {
        this.sasUri = sasUri;
        return this;
    }

    /**
     * Get the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @return the sasToken value.
     */
    public AzureKeyVaultSecretReference getSasToken() {
        return this.sasToken;
    }

    /**
     * Set the sasToken property: The Azure key vault secret reference of sasToken in sas uri.
     *
     * @param sasToken the sasToken value to set.
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService setSasToken(AzureKeyVaultSecretReference sasToken) {
        this.sasToken = sasToken;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public String getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureStorageLinkedService object itself.
     */
    public AzureStorageLinkedService setEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
