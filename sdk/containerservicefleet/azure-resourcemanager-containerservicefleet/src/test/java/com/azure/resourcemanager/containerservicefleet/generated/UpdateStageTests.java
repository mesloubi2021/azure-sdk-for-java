// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.UpdateGroup;
import com.azure.resourcemanager.containerservicefleet.models.UpdateStage;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpdateStageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateStage model =
            BinaryData
                .fromString(
                    "{\"name\":\"hy\",\"groups\":[{\"name\":\"rpmopjmc\"},{\"name\":\"atuokthfuiu\"}],\"afterStageWaitInSeconds\":1445775245}")
                .toObject(UpdateStage.class);
        Assertions.assertEquals("hy", model.name());
        Assertions.assertEquals("rpmopjmc", model.groups().get(0).name());
        Assertions.assertEquals(1445775245, model.afterStageWaitInSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateStage model =
            new UpdateStage()
                .withName("hy")
                .withGroups(
                    Arrays.asList(new UpdateGroup().withName("rpmopjmc"), new UpdateGroup().withName("atuokthfuiu")))
                .withAfterStageWaitInSeconds(1445775245);
        model = BinaryData.fromObject(model).toObject(UpdateStage.class);
        Assertions.assertEquals("hy", model.name());
        Assertions.assertEquals("rpmopjmc", model.groups().get(0).name());
        Assertions.assertEquals(1445775245, model.afterStageWaitInSeconds());
    }
}
