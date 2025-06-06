/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.search_pipeline;

import javax.annotation.Generated;

/**
 * Builders for {@link RequestProcessor} variants.
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class RequestProcessorBuilders {
    private RequestProcessorBuilders() {}

    /**
     * Creates a builder for the {@link FilterQueryRequestProcessor filter_query} {@code RequestProcessor} variant.
     */
    public static FilterQueryRequestProcessor.Builder filterQuery() {
        return new FilterQueryRequestProcessor.Builder();
    }

    /**
     * Creates a builder for the {@link NeuralQueryEnricherRequestProcessor neural_query_enricher} {@code RequestProcessor} variant.
     */
    public static NeuralQueryEnricherRequestProcessor.Builder neuralQueryEnricher() {
        return new NeuralQueryEnricherRequestProcessor.Builder();
    }

    /**
     * Creates a builder for the {@link OversampleRequestProcessor oversample} {@code RequestProcessor} variant.
     */
    public static OversampleRequestProcessor.Builder oversample() {
        return new OversampleRequestProcessor.Builder();
    }

    /**
     * Creates a builder for the {@link SearchScriptRequestProcessor script} {@code RequestProcessor} variant.
     */
    public static SearchScriptRequestProcessor.Builder script() {
        return new SearchScriptRequestProcessor.Builder();
    }
}
