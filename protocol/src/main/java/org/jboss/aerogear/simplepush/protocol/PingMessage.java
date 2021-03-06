/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.simplepush.protocol;


/**
 * Represents the Ping message in the
 * <a href="https://wiki.mozilla.org/WebAPI/SimplePush/Protocol">SimplePush specification protocol</a>
 * </p>
 * This message can be send by the UserAgent to verify that the connection to the server is working.
 * The Ping messge type does not follow the model of the other messages in the protocol which all have
 * a 'messageType' field identifying the type of message. The Ping message is indended to be as small
 * as possible. The actual payload is not specified but recommended to be a simple empty JavaScript
 * object, '{}'
 *
 */
public interface PingMessage extends MessageType {

    /**
     * The default value for a Ping message body.
     */
    String PING_MESSAGE = "{}";

    /**
     * Returns contents of the ping message, which should be '{}'.
     *
     * @return {@code String}  the contents of the ping message.
     */
    String getPingMessage();

}
