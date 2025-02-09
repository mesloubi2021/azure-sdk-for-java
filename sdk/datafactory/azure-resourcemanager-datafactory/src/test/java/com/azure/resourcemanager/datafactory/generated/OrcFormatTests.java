// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OrcFormat;

public final class OrcFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OrcFormat model =
            BinaryData
                .fromString(
                    "{\"type\":\"OrcFormat\",\"serializer\":\"datalbsnosnqliw\",\"deserializer\":\"dataz\",\"\":{\"mknazgbjbhrpgiq\":\"dataetyalht\",\"aixpqj\":\"datattcucrcm\"}}")
                .toObject(OrcFormat.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OrcFormat model = new OrcFormat().withSerializer("datalbsnosnqliw").withDeserializer("dataz");
        model = BinaryData.fromObject(model).toObject(OrcFormat.class);
    }
}
