// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.HttpSource;

public final class HttpSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HttpSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"HttpSource\",\"httpRequestTimeout\":\"datakiff\",\"sourceRetryCount\":\"datawdyzse\",\"sourceRetryWait\":\"datamvtqhn\",\"maxConcurrentConnections\":\"dataiju\",\"disableMetricsCollection\":\"datarkqywybxgayomse\",\"\":{\"polpsap\":\"dataxlisvqfblsiz\"}}")
                .toObject(HttpSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HttpSource model =
            new HttpSource()
                .withSourceRetryCount("datawdyzse")
                .withSourceRetryWait("datamvtqhn")
                .withMaxConcurrentConnections("dataiju")
                .withDisableMetricsCollection("datarkqywybxgayomse")
                .withHttpRequestTimeout("datakiff");
        model = BinaryData.fromObject(model).toObject(HttpSource.class);
    }
}
