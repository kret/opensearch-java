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

package org.opensearch.client.opensearch.indices.analyze;

import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.CopyableBuilder;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import org.opensearch.client.util.ToCopyableBuilder;

// typedef: indices.analyze.AnalyzerDetail

/**
 * The analyzer results.
 */
@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class AnalyzerDetail implements PlainJsonSerializable, ToCopyableBuilder<AnalyzerDetail.Builder, AnalyzerDetail> {

    @Nonnull
    private final String name;

    @Nonnull
    private final List<ExplainAnalyzeToken> tokens;

    // ---------------------------------------------------------------------------------------------

    private AnalyzerDetail(Builder builder) {
        this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
        this.tokens = ApiTypeHelper.unmodifiableRequired(builder.tokens, this, "tokens");
    }

    public static AnalyzerDetail of(Function<AnalyzerDetail.Builder, ObjectBuilder<AnalyzerDetail>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - The name of the analyzer.
     * <p>
     * API name: {@code name}
     * </p>
     */
    @Nonnull
    public final String name() {
        return this.name;
    }

    /**
     * Required - The list of tokens produced by the analyzer.
     * <p>
     * API name: {@code tokens}
     * </p>
     */
    @Nonnull
    public final List<ExplainAnalyzeToken> tokens() {
        return this.tokens;
    }

    /**
     * Serialize this object to JSON.
     */
    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        serializeInternal(generator, mapper);
        generator.writeEnd();
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeKey("name");
        generator.write(this.name);

        generator.writeKey("tokens");
        generator.writeStartArray();
        for (ExplainAnalyzeToken item0 : this.tokens) {
            item0.serialize(generator, mapper);
        }
        generator.writeEnd();
    }

    // ---------------------------------------------------------------------------------------------

    @Override
    @Nonnull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Nonnull
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for {@link AnalyzerDetail}.
     */
    public static class Builder extends ObjectBuilderBase implements CopyableBuilder<Builder, AnalyzerDetail> {
        private String name;
        private List<ExplainAnalyzeToken> tokens;

        public Builder() {}

        private Builder(AnalyzerDetail o) {
            this.name = o.name;
            this.tokens = _listCopy(o.tokens);
        }

        private Builder(Builder o) {
            this.name = o.name;
            this.tokens = _listCopy(o.tokens);
        }

        @Override
        @Nonnull
        public Builder copy() {
            return new Builder(this);
        }

        /**
         * Required - The name of the analyzer.
         * <p>
         * API name: {@code name}
         * </p>
         */
        @Nonnull
        public final Builder name(String value) {
            this.name = value;
            return this;
        }

        /**
         * Required - The list of tokens produced by the analyzer.
         * <p>
         * API name: {@code tokens}
         * </p>
         *
         * <p>
         * Adds all elements of <code>list</code> to <code>tokens</code>.
         * </p>
         */
        @Nonnull
        public final Builder tokens(List<ExplainAnalyzeToken> list) {
            this.tokens = _listAddAll(this.tokens, list);
            return this;
        }

        /**
         * Required - The list of tokens produced by the analyzer.
         * <p>
         * API name: {@code tokens}
         * </p>
         *
         * <p>
         * Adds one or more values to <code>tokens</code>.
         * </p>
         */
        @Nonnull
        public final Builder tokens(ExplainAnalyzeToken value, ExplainAnalyzeToken... values) {
            this.tokens = _listAdd(this.tokens, value, values);
            return this;
        }

        /**
         * Required - The list of tokens produced by the analyzer.
         * <p>
         * API name: {@code tokens}
         * </p>
         *
         * <p>
         * Adds a value to <code>tokens</code> using a builder lambda.
         * </p>
         */
        @Nonnull
        public final Builder tokens(Function<ExplainAnalyzeToken.Builder, ObjectBuilder<ExplainAnalyzeToken>> fn) {
            return tokens(fn.apply(new ExplainAnalyzeToken.Builder()).build());
        }

        /**
         * Builds a {@link AnalyzerDetail}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public AnalyzerDetail build() {
            _checkSingleUse();

            return new AnalyzerDetail(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link AnalyzerDetail}
     */
    public static final JsonpDeserializer<AnalyzerDetail> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        AnalyzerDetail::setupAnalyzerDetailDeserializer
    );

    protected static void setupAnalyzerDetailDeserializer(ObjectDeserializer<AnalyzerDetail.Builder> op) {
        op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
        op.add(Builder::tokens, JsonpDeserializer.arrayDeserializer(ExplainAnalyzeToken._DESERIALIZER), "tokens");
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.tokens.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        AnalyzerDetail other = (AnalyzerDetail) o;
        return this.name.equals(other.name) && this.tokens.equals(other.tokens);
    }
}
