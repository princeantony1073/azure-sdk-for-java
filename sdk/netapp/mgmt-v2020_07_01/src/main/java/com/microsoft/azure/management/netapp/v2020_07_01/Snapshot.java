/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.netapp.v2020_07_01.implementation.SnapshotInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2020_07_01.implementation.NetAppManager;
import org.joda.time.DateTime;

/**
 * Type representing Snapshot.
 */
public interface Snapshot extends HasInner<SnapshotInner>, Indexable, Refreshable<Snapshot>, Updatable<Snapshot.Update>, HasManager<NetAppManager> {
    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the snapshotId value.
     */
    String snapshotId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Snapshot definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVolume, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Snapshot definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Snapshot definition.
         */
        interface Blank extends WithVolume {
        }

        /**
         * The stage of the snapshot definition allowing to specify Volume.
         */
        interface WithVolume {
           /**
            * Specifies resourceGroupName, accountName, poolName, volumeName.
            * @param resourceGroupName The name of the resource group
            * @param accountName The name of the NetApp account
            * @param poolName The name of the capacity pool
            * @param volumeName The name of the volume
            * @return the next definition stage
            */
            WithLocation withExistingVolume(String resourceGroupName, String accountName, String poolName, String volumeName);
        }

        /**
         * The stage of the snapshot definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Snapshot> {
        }
    }
    /**
     * The template for a Snapshot update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Snapshot>, UpdateStages.WithBody {
    }

    /**
     * Grouping of Snapshot update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the snapshot update allowing to specify Body.
         */
        interface WithBody {
            /**
             * Specifies body.
             * @param body Snapshot object supplied in the body of the operation
             * @return the next update stage
             */
            Update withBody(Object body);
        }

    }
}
