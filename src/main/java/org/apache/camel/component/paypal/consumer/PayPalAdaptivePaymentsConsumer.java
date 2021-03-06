/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.paypal.consumer;

import org.apache.camel.Endpoint;
import org.apache.camel.Processor;
import org.apache.camel.component.paypal.PayPalConfiguration;
import org.apache.camel.impl.DefaultConsumer;

/**
 * User: Apache Software Foundation :: Apache Camel
 * Date: 2/25/13
 * Time: 8:11 PM
 * Year: 2013
 * Project: camel
 */
public class PayPalAdaptivePaymentsConsumer extends DefaultConsumer {

    private PayPalConfiguration configuration;

    public PayPalAdaptivePaymentsConsumer(final Endpoint endpoint, final PayPalConfiguration configuration, final Processor processor) {
        super(endpoint, processor);

        this.configuration = configuration;
    }
}
