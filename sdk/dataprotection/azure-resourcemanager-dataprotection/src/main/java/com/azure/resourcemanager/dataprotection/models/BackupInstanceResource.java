// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.fluent.models.BackupInstanceResourceInner;
import java.util.Map;

/** An immutable client-side representation of BackupInstanceResource. */
public interface BackupInstanceResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the tags property: Proxy Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the properties property: BackupInstanceResource properties.
     *
     * @return the properties value.
     */
    BackupInstance properties();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.dataprotection.fluent.models.BackupInstanceResourceInner object.
     *
     * @return the inner object.
     */
    BackupInstanceResourceInner innerModel();

    /** The entirety of the BackupInstanceResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /** The BackupInstanceResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the BackupInstanceResource definition. */
        interface Blank extends WithParentResource {
        }

        /** The stage of the BackupInstanceResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, vaultName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param vaultName The name of the backup vault.
             * @return the next definition stage.
             */
            WithCreate withExistingBackupVault(String resourceGroupName, String vaultName);
        }

        /**
         * The stage of the BackupInstanceResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BackupInstanceResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BackupInstanceResource create(Context context);
        }

        /** The stage of the BackupInstanceResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Proxy Resource tags..
             *
             * @param tags Proxy Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the BackupInstanceResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: BackupInstanceResource properties.
             *
             * @param properties BackupInstanceResource properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(BackupInstance properties);
        }
    }

    /**
     * Begins update for the BackupInstanceResource resource.
     *
     * @return the stage of resource update.
     */
    BackupInstanceResource.Update update();

    /** The template for BackupInstanceResource update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BackupInstanceResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BackupInstanceResource apply(Context context);
    }

    /** The BackupInstanceResource update stages. */
    interface UpdateStages {
        /** The stage of the BackupInstanceResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Proxy Resource tags..
             *
             * @param tags Proxy Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the BackupInstanceResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: BackupInstanceResource properties.
             *
             * @param properties BackupInstanceResource properties.
             * @return the next definition stage.
             */
            Update withProperties(BackupInstance properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BackupInstanceResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BackupInstanceResource refresh(Context context);

    /**
     * Trigger adhoc backup.
     *
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operationJobExtendedInfo.
     */
    OperationJobExtendedInfo adhocBackup(TriggerBackupRequest parameters);

    /**
     * Trigger adhoc backup.
     *
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operationJobExtendedInfo.
     */
    OperationJobExtendedInfo adhocBackup(TriggerBackupRequest parameters, Context context);

    /**
     * rehydrate recovery point for restore for a BackupInstance.
     *
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerRehydrate(AzureBackupRehydrationRequest parameters);

    /**
     * rehydrate recovery point for restore for a BackupInstance.
     *
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerRehydrate(AzureBackupRehydrationRequest parameters, Context context);

    /**
     * Triggers restore for a BackupInstance.
     *
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operationJobExtendedInfo.
     */
    OperationJobExtendedInfo triggerRestore(AzureBackupRestoreRequest parameters);

    /**
     * Triggers restore for a BackupInstance.
     *
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operationJobExtendedInfo.
     */
    OperationJobExtendedInfo triggerRestore(AzureBackupRestoreRequest parameters, Context context);

    /**
     * This operation will resume backups for backup instance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resumeBackups();

    /**
     * This operation will resume backups for backup instance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resumeBackups(Context context);

    /**
     * This operation will resume protection for a stopped backup instance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resumeProtection();

    /**
     * This operation will resume protection for a stopped backup instance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resumeProtection(Context context);

    /**
     * This operation will stop protection of a backup instance and data will be held forever.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stopProtection();

    /**
     * This operation will stop protection of a backup instance and data will be held forever.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stopProtection(Context context);

    /**
     * This operation will stop backup for a backup instance and retains the backup data as per the policy (except
     * latest Recovery point, which will be retained forever).
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void suspendBackups();

    /**
     * This operation will stop backup for a backup instance and retains the backup data as per the policy (except
     * latest Recovery point, which will be retained forever).
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void suspendBackups(Context context);

    /**
     * Sync backup instance again in case of failure This action will retry last failed operation and will bring backup
     * instance to valid state.
     *
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void syncBackupInstance(SyncBackupInstanceRequest parameters);

    /**
     * Sync backup instance again in case of failure This action will retry last failed operation and will bring backup
     * instance to valid state.
     *
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void syncBackupInstance(SyncBackupInstanceRequest parameters, Context context);

    /**
     * Validates if Restore can be triggered for a DataSource.
     *
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operationJobExtendedInfo.
     */
    OperationJobExtendedInfo validateForRestore(ValidateRestoreRequestObject parameters);

    /**
     * Validates if Restore can be triggered for a DataSource.
     *
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operationJobExtendedInfo.
     */
    OperationJobExtendedInfo validateForRestore(ValidateRestoreRequestObject parameters, Context context);
}
