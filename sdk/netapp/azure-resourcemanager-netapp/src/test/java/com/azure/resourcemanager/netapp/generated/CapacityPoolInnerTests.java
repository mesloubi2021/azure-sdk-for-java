// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.CapacityPoolInner;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CapacityPoolInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapacityPoolInner model =
            BinaryData
                .fromString(
                    "{\"etag\":\"qugxywpmueefjzwf\",\"properties\":{\"poolId\":\"q\",\"size\":7502146387336972702,\"serviceLevel\":\"Ultra\",\"provisioningState\":\"uyonobglaoc\",\"totalThroughputMibps\":17.340857,\"utilizedThroughputMibps\":36.81238,\"qosType\":\"Auto\",\"coolAccess\":true,\"encryptionType\":\"Single\"},\"location\":\"tlmoyrx\",\"tags\":{\"wpzntxhdzh\":\"u\",\"rxsbkyvp\":\"rqjbhckfrl\"},\"id\":\"ca\",\"name\":\"uzbpzkafku\",\"type\":\"b\"}")
                .toObject(CapacityPoolInner.class);
        Assertions.assertEquals("tlmoyrx", model.location());
        Assertions.assertEquals("u", model.tags().get("wpzntxhdzh"));
        Assertions.assertEquals(7502146387336972702L, model.size());
        Assertions.assertEquals(ServiceLevel.ULTRA, model.serviceLevel());
        Assertions.assertEquals(QosType.AUTO, model.qosType());
        Assertions.assertEquals(true, model.coolAccess());
        Assertions.assertEquals(EncryptionType.SINGLE, model.encryptionType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapacityPoolInner model =
            new CapacityPoolInner()
                .withLocation("tlmoyrx")
                .withTags(mapOf("wpzntxhdzh", "u", "rxsbkyvp", "rqjbhckfrl"))
                .withSize(7502146387336972702L)
                .withServiceLevel(ServiceLevel.ULTRA)
                .withQosType(QosType.AUTO)
                .withCoolAccess(true)
                .withEncryptionType(EncryptionType.SINGLE);
        model = BinaryData.fromObject(model).toObject(CapacityPoolInner.class);
        Assertions.assertEquals("tlmoyrx", model.location());
        Assertions.assertEquals("u", model.tags().get("wpzntxhdzh"));
        Assertions.assertEquals(7502146387336972702L, model.size());
        Assertions.assertEquals(ServiceLevel.ULTRA, model.serviceLevel());
        Assertions.assertEquals(QosType.AUTO, model.qosType());
        Assertions.assertEquals(true, model.coolAccess());
        Assertions.assertEquals(EncryptionType.SINGLE, model.encryptionType());
    }

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
