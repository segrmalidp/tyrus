/*
 * Copyright (c) 2011, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.glassfish.tyrus.sample.chat.chatdata;

/**
 * @author Danny Coward (danny.coward at oracle.com)
 */
public class DisconnectRequestMessage extends SimpleMessage {

    public DisconnectRequestMessage(String username) {
        super(DISCONNECT_REQUEST, username);
    }

    public DisconnectRequestMessage() {
        super(DISCONNECT_REQUEST, "");
    }

    public String getUsername() {
        return super.getData();
    }


}
