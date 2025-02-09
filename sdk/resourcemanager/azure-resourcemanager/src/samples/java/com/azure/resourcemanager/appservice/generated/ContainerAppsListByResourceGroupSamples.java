// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for ContainerApps ListByResourceGroup. */
public final class ContainerAppsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/ListContainerAppsByResourceGroup.json
     */
    /**
     * Sample code: List Container Apps by resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listContainerAppsByResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getContainerApps()
            .listByResourceGroup("rg", com.azure.core.util.Context.NONE);
    }
}
