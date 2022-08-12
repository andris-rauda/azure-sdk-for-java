// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.rooms.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RoomJoinPolicy. */
public final class RoomJoinPolicy extends ExpandableStringEnum<RoomJoinPolicy> {
    /** Static value InviteOnly for RoomJoinPolicy. */
    public static final RoomJoinPolicy INVITE_ONLY = fromString("InviteOnly");

    /** Static value CommunicationServiceUsers for RoomJoinPolicy. */
    public static final RoomJoinPolicy COMMUNICATION_SERVICE_USERS = fromString("CommunicationServiceUsers");

    /**
     * Creates or finds a RoomJoinPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoomJoinPolicy.
     */
    @JsonCreator
    public static RoomJoinPolicy fromString(String name) {
        return fromString(name, RoomJoinPolicy.class);
    }

    /**
     * Gets known RoomJoinPolicy values.
     *
     * @return known RoomJoinPolicy values.
     */
    public static Collection<RoomJoinPolicy> values() {
        return values(RoomJoinPolicy.class);
    }
}