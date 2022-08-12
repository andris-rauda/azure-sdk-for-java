// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.Context;

/** Samples for Connection ListByAutomationAccount. */
public final class ConnectionListByAutomationAccountSamples {
    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listConnectionsByAutomationAccount_First100.json
     */
    /**
     * Sample code: List connections by automation account, first 100.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listConnectionsByAutomationAccountFirst100(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.connections().listByAutomationAccount("rg", "myAutomationAccount28", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/listConnectionsByAutomationAccount_Next100.json
     */
    /**
     * Sample code: List connections by automation account, next 100.
     *
     * @param manager Entry point to AutomationManager.
     */
    public static void listConnectionsByAutomationAccountNext100(
        com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.connections().listByAutomationAccount("rg", "myAutomationAccount28", Context.NONE);
    }
}