/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.implementation.AppConfigurationManager;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.appconfiguration.v2020_06_01.implementation.ConfigurationStoreInner;

/**
 * Type representing ConfigurationStore.
 */
public interface ConfigurationStore extends HasInner<ConfigurationStoreInner>, Resource, GroupableResourceCore<AppConfigurationManager, ConfigurationStoreInner>, HasResourceGroup, Refreshable<ConfigurationStore>, Updatable<ConfigurationStore.Update>, HasManager<AppConfigurationManager> {
    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the encryption value.
     */
    EncryptionProperties encryption();

    /**
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnectionReference> privateEndpointConnections();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * The entirety of the ConfigurationStore definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ConfigurationStore definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ConfigurationStore definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ConfigurationStore definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithSku> {
        }

        /**
         * The stage of the configurationstore definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku The sku of the configuration store
            * @return the next definition stage
*/
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the configurationstore definition allowing to specify Encryption.
         */
        interface WithEncryption {
            /**
             * Specifies encryption.
             * @param encryption The encryption settings of the configuration store
             * @return the next definition stage
             */
            WithCreate withEncryption(EncryptionProperties encryption);
        }

        /**
         * The stage of the configurationstore definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The managed identity information, if configured
             * @return the next definition stage
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the configurationstore definition allowing to specify PublicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies publicNetworkAccess.
             * @param publicNetworkAccess Control permission for data plane traffic coming from public networks while private endpoint is enabled. Possible values include: 'Enabled', 'Disabled'
             * @return the next definition stage
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ConfigurationStore>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEncryption, DefinitionStages.WithIdentity, DefinitionStages.WithPublicNetworkAccess {
        }
    }
    /**
     * The template for a ConfigurationStore update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ConfigurationStore>, Resource.UpdateWithTags<Update>, UpdateStages.WithEncryption, UpdateStages.WithIdentity, UpdateStages.WithPublicNetworkAccess, UpdateStages.WithSku {
    }

    /**
     * Grouping of ConfigurationStore update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the configurationstore update allowing to specify Encryption.
         */
        interface WithEncryption {
            /**
             * Specifies encryption.
             * @param encryption The encryption settings of the configuration store
             * @return the next update stage
             */
            Update withEncryption(EncryptionProperties encryption);
        }

        /**
         * The stage of the configurationstore update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The managed identity information for the configuration store
             * @return the next update stage
             */
            Update withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the configurationstore update allowing to specify PublicNetworkAccess.
         */
        interface WithPublicNetworkAccess {
            /**
             * Specifies publicNetworkAccess.
             * @param publicNetworkAccess Control permission for data plane traffic coming from public networks while private endpoint is enabled. Possible values include: 'Enabled', 'Disabled'
             * @return the next update stage
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }

        /**
         * The stage of the configurationstore update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU of the configuration store
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

    }
}
