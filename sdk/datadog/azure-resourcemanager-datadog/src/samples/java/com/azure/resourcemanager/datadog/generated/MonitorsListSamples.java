// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

/** Samples for Monitors List. */
public final class MonitorsListSamples {
    /*
     * x-ms-original-file: specification/datadog/resource-manager/Microsoft.Datadog/stable/2021-03-01/examples/Monitors_List.json
     */
    /**
     * Sample code: Monitors_List.
     *
     * @param manager Entry point to MicrosoftDatadogManager.
     */
    public static void monitorsList(com.azure.resourcemanager.datadog.MicrosoftDatadogManager manager) {
        manager.monitors().list(com.azure.core.util.Context.NONE);
    }
}
