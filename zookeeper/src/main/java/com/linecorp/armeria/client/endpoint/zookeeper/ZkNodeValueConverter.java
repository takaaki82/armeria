/*
 * Copyright 2016 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.linecorp.armeria.client.endpoint.zookeeper;

import java.util.List;

import com.linecorp.armeria.client.Endpoint;

/**
 * Converts a zNode value into a list of {@link Endpoint}s.
 */
@FunctionalInterface
public interface ZkNodeValueConverter {
    /**
     * Converts a zNode value into a list of {@link Endpoint}s.
     * @param zNodeValue zNode value
     * @return the list of {@link Endpoint}s
     */
    List<Endpoint> convert(byte[] zNodeValue);
}
