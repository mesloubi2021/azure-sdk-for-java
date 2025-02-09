// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.ChangelogInner;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ChangelogInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChangelogInner model =
            BinaryData
                .fromString(
                    "{\"changes\":[\"mohctb\"],\"lastCommitted\":\"2021-09-18T10:27:07Z\",\"lastModified\":\"2021-12-08T15:20:53Z\"}")
                .toObject(ChangelogInner.class);
        Assertions.assertEquals("mohctb", model.changes().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-18T10:27:07Z"), model.lastCommitted());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-08T15:20:53Z"), model.lastModified());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChangelogInner model =
            new ChangelogInner()
                .withChanges(Arrays.asList("mohctb"))
                .withLastCommitted(OffsetDateTime.parse("2021-09-18T10:27:07Z"))
                .withLastModified(OffsetDateTime.parse("2021-12-08T15:20:53Z"));
        model = BinaryData.fromObject(model).toObject(ChangelogInner.class);
        Assertions.assertEquals("mohctb", model.changes().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-18T10:27:07Z"), model.lastCommitted());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-08T15:20:53Z"), model.lastModified());
    }
}
