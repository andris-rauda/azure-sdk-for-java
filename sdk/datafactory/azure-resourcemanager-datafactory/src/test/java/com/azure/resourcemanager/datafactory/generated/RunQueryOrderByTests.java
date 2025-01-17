// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.RunQueryOrder;
import com.azure.resourcemanager.datafactory.models.RunQueryOrderBy;
import com.azure.resourcemanager.datafactory.models.RunQueryOrderByField;
import org.junit.jupiter.api.Assertions;

public final class RunQueryOrderByTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RunQueryOrderBy model =
            BinaryData.fromString("{\"orderBy\":\"ActivityName\",\"order\":\"ASC\"}").toObject(RunQueryOrderBy.class);
        Assertions.assertEquals(RunQueryOrderByField.ACTIVITY_NAME, model.orderBy());
        Assertions.assertEquals(RunQueryOrder.ASC, model.order());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RunQueryOrderBy model =
            new RunQueryOrderBy().withOrderBy(RunQueryOrderByField.ACTIVITY_NAME).withOrder(RunQueryOrder.ASC);
        model = BinaryData.fromObject(model).toObject(RunQueryOrderBy.class);
        Assertions.assertEquals(RunQueryOrderByField.ACTIVITY_NAME, model.orderBy());
        Assertions.assertEquals(RunQueryOrder.ASC, model.order());
    }
}
