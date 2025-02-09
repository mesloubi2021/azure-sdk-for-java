// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntime;
import com.azure.resourcemanager.datafactory.models.SelfHostedIntegrationRuntimeStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class SelfHostedIntegrationRuntimeStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SelfHostedIntegrationRuntimeStatus model =
            BinaryData
                .fromString(
                    "{\"type\":\"SelfHosted\",\"typeProperties\":{\"createTime\":\"2021-10-25T13:01:31Z\",\"taskQueueId\":\"zqkeb\",\"internalChannelEncryption\":\"SslEncrypted\",\"version\":\"euecokyduqzuscol\",\"nodes\":[{\"nodeName\":\"htekxnvkdvc\",\"machineName\":\"wrd\",\"hostServiceUri\":\"dddwzd\",\"status\":\"NeedRegistration\",\"capabilities\":{\"th\":\"tamkyrkw\",\"jbfyroswnfqdfwv\":\"ivocffxhvnodqq\"},\"versionStatus\":\"frwv\",\"version\":\"pztuskpncdocloe\",\"registerTime\":\"2021-07-10T09:56:33Z\",\"lastConnectTime\":\"2021-12-01T16:50:08Z\",\"expiryTime\":\"2021-02-26T17:40:53Z\",\"lastStartTime\":\"2021-12-01T08:38:07Z\",\"lastStopTime\":\"2021-01-01T00:19:44Z\",\"lastUpdateResult\":\"None\",\"lastStartUpdateTime\":\"2021-01-22T09:30:22Z\",\"lastEndUpdateTime\":\"2021-02-18T06:02:30Z\",\"isActiveDispatcher\":true,\"concurrentJobsLimit\":1255010418,\"maxConcurrentJobs\":1505679455,\"\":{\"wqsni\":\"dataunngjoasnzlaw\",\"vukszkmxbh\":\"dataxwdqzu\",\"vaeg\":\"datap\"}},{\"nodeName\":\"mqonxvnmcyze\",\"machineName\":\"vw\",\"hostServiceUri\":\"esswbrnbox\",\"status\":\"Limited\",\"capabilities\":{\"mhmifhfutjyx\":\"qfvbksksmqmwow\"},\"versionStatus\":\"mgt\",\"version\":\"qaemo\",\"registerTime\":\"2021-02-27T17:53:42Z\",\"lastConnectTime\":\"2021-04-04T14:18:04Z\",\"expiryTime\":\"2021-03-07T22:35:11Z\",\"lastStartTime\":\"2021-01-16T10:07:16Z\",\"lastStopTime\":\"2021-09-10T19:37:52Z\",\"lastUpdateResult\":\"None\",\"lastStartUpdateTime\":\"2021-04-09T12:09:36Z\",\"lastEndUpdateTime\":\"2021-08-08T17:12:18Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":1357414966,\"maxConcurrentJobs\":1990441761,\"\":{\"xgdpivjkhcoscol\":\"dataydksvjf\",\"qkaqdvwojvx\":\"datajhcsgzooefzsdtt\",\"hrqxrqghotingzi\":\"dataf\"}},{\"nodeName\":\"gygawyhpwmdk\",\"machineName\":\"gyelvyh\",\"hostServiceUri\":\"puqyrpubbkhcidc\",\"status\":\"NeedRegistration\",\"capabilities\":{\"zowgmmixf\":\"ku\",\"jnpahzhpqscuyil\":\"aupgblna\",\"ebmuiongmndwohoe\":\"qjzri\",\"uxfvbjimzwynsm\":\"s\"},\"versionStatus\":\"hvkyezwseyuo\",\"version\":\"mjw\",\"registerTime\":\"2021-01-09T04:00:09Z\",\"lastConnectTime\":\"2021-08-26T03:52:19Z\",\"expiryTime\":\"2021-05-27T13:05:43Z\",\"lastStartTime\":\"2021-07-09T20:27:44Z\",\"lastStopTime\":\"2021-08-19T10:17:05Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-03-27T21:52:11Z\",\"lastEndUpdateTime\":\"2021-06-14T00:28:05Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":579396297,\"maxConcurrentJobs\":939575126,\"\":{\"ymnrtvq\":\"datawax\",\"kvyqpvz\":\"dataimavyotpcvpahh\",\"wtominrufqqa\":\"dataxzn\"}},{\"nodeName\":\"gasfmhbxv\",\"machineName\":\"kqnatxvuzc\",\"hostServiceUri\":\"lirybytcaqp\",\"status\":\"Initializing\",\"capabilities\":{\"vxyyhhsisz\":\"bn\",\"uukaamimkjz\":\"qfrpanteqiw\",\"xvksij\":\"xysjd\"},\"versionStatus\":\"gyindexijovu\",\"version\":\"uupzeadd\",\"registerTime\":\"2021-06-23T09:58:27Z\",\"lastConnectTime\":\"2021-06-04T16:21:17Z\",\"expiryTime\":\"2021-02-03T05:13:03Z\",\"lastStartTime\":\"2021-02-27T19:33:05Z\",\"lastStopTime\":\"2021-10-01T21:16:03Z\",\"lastUpdateResult\":\"None\",\"lastStartUpdateTime\":\"2021-12-01T18:49:21Z\",\"lastEndUpdateTime\":\"2021-06-17T04:35:24Z\",\"isActiveDispatcher\":true,\"concurrentJobsLimit\":1693962581,\"maxConcurrentJobs\":1798638813,\"\":{\"oabfcvefb\":\"dataxbthtnyzpuonrmdl\",\"uy\":\"dataxpmgyqshsasmr\"}}],\"scheduledUpdateDate\":\"2021-10-28T22:40:11Z\",\"updateDelayOffset\":\"xrgrztkyqgu\",\"localTimeZoneOffset\":\"uih\",\"capabilities\":{\"rpfivypm\":\"gkyncyzjndfeemxi\",\"cr\":\"dzaj\"},\"serviceUrls\":[\"poqimy\",\"xnpdggllyduyu\",\"dmzu\",\"xvzvwlxd\"],\"autoUpdate\":\"Off\",\"versionStatus\":\"zeurdoxkl\",\"links\":[{\"name\":\"siznymwz\",\"subscriptionId\":\"pkihqhnfubevwa\",\"dataFactoryName\":\"c\",\"dataFactoryLocation\":\"xevlt\",\"createTime\":\"2021-03-14T00:40:42Z\"},{\"name\":\"oqiaklqakpstifm\",\"subscriptionId\":\"wrphmriipz\",\"dataFactoryName\":\"ofuadcj\",\"dataFactoryLocation\":\"eaqkg\",\"createTime\":\"2021-03-25T15:46:49Z\"},{\"name\":\"r\",\"subscriptionId\":\"eynqlsnrgaxoyv\",\"dataFactoryName\":\"jpf\",\"dataFactoryLocation\":\"hsppvjsduouoqte\",\"createTime\":\"2021-09-10T05:04:14Z\"}],\"pushedVersion\":\"muogeq\",\"latestVersion\":\"paseqcp\",\"autoUpdateETA\":\"2021-03-07T20:06:56Z\",\"selfContainedInteractiveAuthoringEnabled\":false},\"dataFactoryName\":\"uwvzh\",\"state\":\"Limited\",\"\":{\"f\":\"dataoiq\",\"lwyoxzuhellitpqv\":\"datattqgt\",\"bzvtvxx\":\"dataivrsgqbmolxeom\"}}")
                .toObject(SelfHostedIntegrationRuntimeStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SelfHostedIntegrationRuntimeStatus model =
            new SelfHostedIntegrationRuntimeStatus()
                .withNodes(
                    Arrays
                        .asList(
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "htekxnvkdvc",
                                        "lastStartUpdateTime",
                                        "2021-01-22T09:30:22Z",
                                        "lastConnectTime",
                                        "2021-12-01T16:50:08Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize(
                                                "{\"th\":\"tamkyrkw\",\"jbfyroswnfqdfwv\":\"ivocffxhvnodqq\"}",
                                                Object.class,
                                                SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "dddwzd",
                                        "registerTime",
                                        "2021-07-10T09:56:33Z",
                                        "maxConcurrentJobs",
                                        1505679455,
                                        "lastStopTime",
                                        "2021-01-01T00:19:44Z",
                                        "version",
                                        "pztuskpncdocloe",
                                        "machineName",
                                        "wrd",
                                        "versionStatus",
                                        "frwv",
                                        "concurrentJobsLimit",
                                        1255010418,
                                        "lastEndUpdateTime",
                                        "2021-02-18T06:02:30Z",
                                        "expiryTime",
                                        "2021-02-26T17:40:53Z",
                                        "lastStartTime",
                                        "2021-12-01T08:38:07Z",
                                        "lastUpdateResult",
                                        "None",
                                        "isActiveDispatcher",
                                        true,
                                        "status",
                                        "NeedRegistration")),
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "mqonxvnmcyze",
                                        "lastStartUpdateTime",
                                        "2021-04-09T12:09:36Z",
                                        "lastConnectTime",
                                        "2021-04-04T14:18:04Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize(
                                                "{\"mhmifhfutjyx\":\"qfvbksksmqmwow\"}",
                                                Object.class,
                                                SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "esswbrnbox",
                                        "registerTime",
                                        "2021-02-27T17:53:42Z",
                                        "maxConcurrentJobs",
                                        1990441761,
                                        "lastStopTime",
                                        "2021-09-10T19:37:52Z",
                                        "version",
                                        "qaemo",
                                        "machineName",
                                        "vw",
                                        "versionStatus",
                                        "mgt",
                                        "concurrentJobsLimit",
                                        1357414966,
                                        "lastEndUpdateTime",
                                        "2021-08-08T17:12:18Z",
                                        "expiryTime",
                                        "2021-03-07T22:35:11Z",
                                        "lastStartTime",
                                        "2021-01-16T10:07:16Z",
                                        "lastUpdateResult",
                                        "None",
                                        "isActiveDispatcher",
                                        false,
                                        "status",
                                        "Limited")),
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "gygawyhpwmdk",
                                        "lastStartUpdateTime",
                                        "2021-03-27T21:52:11Z",
                                        "lastConnectTime",
                                        "2021-08-26T03:52:19Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize(
                                                "{\"zowgmmixf\":\"ku\",\"jnpahzhpqscuyil\":\"aupgblna\",\"ebmuiongmndwohoe\":\"qjzri\",\"uxfvbjimzwynsm\":\"s\"}",
                                                Object.class,
                                                SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "puqyrpubbkhcidc",
                                        "registerTime",
                                        "2021-01-09T04:00:09Z",
                                        "maxConcurrentJobs",
                                        939575126,
                                        "lastStopTime",
                                        "2021-08-19T10:17:05Z",
                                        "version",
                                        "mjw",
                                        "machineName",
                                        "gyelvyh",
                                        "versionStatus",
                                        "hvkyezwseyuo",
                                        "concurrentJobsLimit",
                                        579396297,
                                        "lastEndUpdateTime",
                                        "2021-06-14T00:28:05Z",
                                        "expiryTime",
                                        "2021-05-27T13:05:43Z",
                                        "lastStartTime",
                                        "2021-07-09T20:27:44Z",
                                        "lastUpdateResult",
                                        "Succeed",
                                        "isActiveDispatcher",
                                        false,
                                        "status",
                                        "NeedRegistration")),
                            new SelfHostedIntegrationRuntimeNodeInner()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "gasfmhbxv",
                                        "lastStartUpdateTime",
                                        "2021-12-01T18:49:21Z",
                                        "lastConnectTime",
                                        "2021-06-04T16:21:17Z",
                                        "capabilities",
                                        JacksonAdapter
                                            .createDefaultSerializerAdapter()
                                            .deserialize(
                                                "{\"vxyyhhsisz\":\"bn\",\"uukaamimkjz\":\"qfrpanteqiw\",\"xvksij\":\"xysjd\"}",
                                                Object.class,
                                                SerializerEncoding.JSON),
                                        "hostServiceUri",
                                        "lirybytcaqp",
                                        "registerTime",
                                        "2021-06-23T09:58:27Z",
                                        "maxConcurrentJobs",
                                        1798638813,
                                        "lastStopTime",
                                        "2021-10-01T21:16:03Z",
                                        "version",
                                        "uupzeadd",
                                        "machineName",
                                        "kqnatxvuzc",
                                        "versionStatus",
                                        "gyindexijovu",
                                        "concurrentJobsLimit",
                                        1693962581,
                                        "lastEndUpdateTime",
                                        "2021-06-17T04:35:24Z",
                                        "expiryTime",
                                        "2021-02-03T05:13:03Z",
                                        "lastStartTime",
                                        "2021-02-27T19:33:05Z",
                                        "lastUpdateResult",
                                        "None",
                                        "isActiveDispatcher",
                                        true,
                                        "status",
                                        "Initializing"))))
                .withLinks(
                    Arrays
                        .asList(
                            new LinkedIntegrationRuntime(),
                            new LinkedIntegrationRuntime(),
                            new LinkedIntegrationRuntime()));
        model = BinaryData.fromObject(model).toObject(SelfHostedIntegrationRuntimeStatus.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
