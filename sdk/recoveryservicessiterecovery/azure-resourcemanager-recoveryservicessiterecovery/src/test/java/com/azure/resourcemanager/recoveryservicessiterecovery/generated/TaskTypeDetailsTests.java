// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TaskTypeDetails;

public final class TaskTypeDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TaskTypeDetails model =
            BinaryData.fromString("{\"instanceType\":\"TaskTypeDetails\"}").toObject(TaskTypeDetails.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TaskTypeDetails model = new TaskTypeDetails();
        model = BinaryData.fromObject(model).toObject(TaskTypeDetails.class);
    }
}
