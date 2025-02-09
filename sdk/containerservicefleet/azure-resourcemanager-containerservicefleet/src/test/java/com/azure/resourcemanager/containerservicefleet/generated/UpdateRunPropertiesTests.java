// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.fluent.models.UpdateRunProperties;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpdate;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeSpec;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeType;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelection;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelectionType;
import com.azure.resourcemanager.containerservicefleet.models.UpdateGroup;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStrategy;
import com.azure.resourcemanager.containerservicefleet.models.UpdateStage;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpdateRunPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateRunProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Succeeded\",\"strategy\":{\"stages\":[{\"name\":\"xrjfeallnwsub\",\"groups\":[{\"name\":\"jampmngnzscxaqw\"},{\"name\":\"ochcbonqvpkvl\"}],\"afterStageWaitInSeconds\":1945684802},{\"name\":\"jease\",\"groups\":[{\"name\":\"eo\"},{\"name\":\"lokeyy\"},{\"name\":\"enjbdlwtgrhp\"},{\"name\":\"jp\"}],\"afterStageWaitInSeconds\":1270874920},{\"name\":\"asxazjpqyegualhb\",\"groups\":[{\"name\":\"e\"},{\"name\":\"jzzvdud\"}],\"afterStageWaitInSeconds\":621270176},{\"name\":\"slfhotwm\",\"groups\":[{\"name\":\"pwlbjnpg\"},{\"name\":\"cftadeh\"},{\"name\":\"nltyfsoppusuesnz\"}],\"afterStageWaitInSeconds\":332314223}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"NodeImageOnly\",\"kubernetesVersion\":\"avo\"},\"nodeImageSelection\":{\"type\":\"Consistent\"}},\"status\":{\"status\":{\"startTime\":\"2021-01-18T23:17:52Z\",\"completedTime\":\"2021-05-10T16:03:24Z\",\"state\":\"Completed\"},\"stages\":[{\"status\":{\"startTime\":\"2021-07-18T13:03:27Z\",\"completedTime\":\"2021-03-23T22:55:01Z\",\"state\":\"Stopped\"},\"name\":\"gujjugwdkcglh\",\"groups\":[{\"status\":{},\"name\":\"dyggdtjixhbku\",\"members\":[{},{},{}]},{\"status\":{},\"name\":\"yk\",\"members\":[{},{},{},{}]}],\"afterStageWaitStatus\":{\"status\":{\"startTime\":\"2021-11-13T11:48:47Z\",\"completedTime\":\"2021-06-20T14:57:34Z\",\"state\":\"Skipped\"},\"waitDurationInSeconds\":1089614022}},{\"status\":{\"startTime\":\"2021-05-17T05:51:50Z\",\"completedTime\":\"2021-02-12T00:37:49Z\",\"state\":\"Stopped\"},\"name\":\"sit\",\"groups\":[{\"status\":{},\"name\":\"mdectehfiqscjey\",\"members\":[{},{}]},{\"status\":{},\"name\":\"rkgqhcjrefo\",\"members\":[{},{},{}]}],\"afterStageWaitStatus\":{\"status\":{\"startTime\":\"2021-02-03T09:21:46Z\",\"completedTime\":\"2021-09-03T21:11:18Z\",\"state\":\"Failed\"},\"waitDurationInSeconds\":1769493620}}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{\"version\":\"attpngjcrcczsq\"}]}}}")
                .toObject(UpdateRunProperties.class);
        Assertions.assertEquals("xrjfeallnwsub", model.strategy().stages().get(0).name());
        Assertions.assertEquals("jampmngnzscxaqw", model.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(1945684802, model.strategy().stages().get(0).afterStageWaitInSeconds());
        Assertions
            .assertEquals(ManagedClusterUpgradeType.NODE_IMAGE_ONLY, model.managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("avo", model.managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions
            .assertEquals(NodeImageSelectionType.CONSISTENT, model.managedClusterUpdate().nodeImageSelection().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateRunProperties model =
            new UpdateRunProperties()
                .withStrategy(
                    new UpdateRunStrategy()
                        .withStages(
                            Arrays
                                .asList(
                                    new UpdateStage()
                                        .withName("xrjfeallnwsub")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("jampmngnzscxaqw"),
                                                    new UpdateGroup().withName("ochcbonqvpkvl")))
                                        .withAfterStageWaitInSeconds(1945684802),
                                    new UpdateStage()
                                        .withName("jease")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("eo"),
                                                    new UpdateGroup().withName("lokeyy"),
                                                    new UpdateGroup().withName("enjbdlwtgrhp"),
                                                    new UpdateGroup().withName("jp")))
                                        .withAfterStageWaitInSeconds(1270874920),
                                    new UpdateStage()
                                        .withName("asxazjpqyegualhb")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("e"),
                                                    new UpdateGroup().withName("jzzvdud")))
                                        .withAfterStageWaitInSeconds(621270176),
                                    new UpdateStage()
                                        .withName("slfhotwm")
                                        .withGroups(
                                            Arrays
                                                .asList(
                                                    new UpdateGroup().withName("pwlbjnpg"),
                                                    new UpdateGroup().withName("cftadeh"),
                                                    new UpdateGroup().withName("nltyfsoppusuesnz")))
                                        .withAfterStageWaitInSeconds(332314223))))
                .withManagedClusterUpdate(
                    new ManagedClusterUpdate()
                        .withUpgrade(
                            new ManagedClusterUpgradeSpec()
                                .withType(ManagedClusterUpgradeType.NODE_IMAGE_ONLY)
                                .withKubernetesVersion("avo"))
                        .withNodeImageSelection(new NodeImageSelection().withType(NodeImageSelectionType.CONSISTENT)));
        model = BinaryData.fromObject(model).toObject(UpdateRunProperties.class);
        Assertions.assertEquals("xrjfeallnwsub", model.strategy().stages().get(0).name());
        Assertions.assertEquals("jampmngnzscxaqw", model.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(1945684802, model.strategy().stages().get(0).afterStageWaitInSeconds());
        Assertions
            .assertEquals(ManagedClusterUpgradeType.NODE_IMAGE_ONLY, model.managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("avo", model.managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions
            .assertEquals(NodeImageSelectionType.CONSISTENT, model.managedClusterUpdate().nodeImageSelection().type());
    }
}
