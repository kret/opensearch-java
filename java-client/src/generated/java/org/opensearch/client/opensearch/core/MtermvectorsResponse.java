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

package org.opensearch.client.opensearch.core;

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
import org.opensearch.client.opensearch.core.mtermvectors.MultiTermVectorsResult;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.CopyableBuilder;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import org.opensearch.client.util.ToCopyableBuilder;

// typedef: _global.mtermvectors.Response

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class MtermvectorsResponse implements PlainJsonSerializable, ToCopyableBuilder<MtermvectorsResponse.Builder, MtermvectorsResponse> {

    @Nonnull
    private final List<MultiTermVectorsResult> docs;

    // ---------------------------------------------------------------------------------------------

    private MtermvectorsResponse(Builder builder) {
        this.docs = ApiTypeHelper.unmodifiableRequired(builder.docs, this, "docs");
    }

    public static MtermvectorsResponse of(Function<MtermvectorsResponse.Builder, ObjectBuilder<MtermvectorsResponse>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - API name: {@code docs}
     */
    @Nonnull
    public final List<MultiTermVectorsResult> docs() {
        return this.docs;
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
        generator.writeKey("docs");
        generator.writeStartArray();
        for (MultiTermVectorsResult item0 : this.docs) {
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
     * Builder for {@link MtermvectorsResponse}.
     */
    public static class Builder extends ObjectBuilderBase implements CopyableBuilder<Builder, MtermvectorsResponse> {
        private List<MultiTermVectorsResult> docs;

        public Builder() {}

        private Builder(MtermvectorsResponse o) {
            this.docs = _listCopy(o.docs);
        }

        private Builder(Builder o) {
            this.docs = _listCopy(o.docs);
        }

        @Override
        @Nonnull
        public Builder copy() {
            return new Builder(this);
        }

        /**
         * Required - API name: {@code docs}
         *
         * <p>
         * Adds all elements of <code>list</code> to <code>docs</code>.
         * </p>
         */
        @Nonnull
        public final Builder docs(List<MultiTermVectorsResult> list) {
            this.docs = _listAddAll(this.docs, list);
            return this;
        }

        /**
         * Required - API name: {@code docs}
         *
         * <p>
         * Adds one or more values to <code>docs</code>.
         * </p>
         */
        @Nonnull
        public final Builder docs(MultiTermVectorsResult value, MultiTermVectorsResult... values) {
            this.docs = _listAdd(this.docs, value, values);
            return this;
        }

        /**
         * Required - API name: {@code docs}
         *
         * <p>
         * Adds a value to <code>docs</code> using a builder lambda.
         * </p>
         */
        @Nonnull
        public final Builder docs(Function<MultiTermVectorsResult.Builder, ObjectBuilder<MultiTermVectorsResult>> fn) {
            return docs(fn.apply(new MultiTermVectorsResult.Builder()).build());
        }

        /**
         * Builds a {@link MtermvectorsResponse}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public MtermvectorsResponse build() {
            _checkSingleUse();

            return new MtermvectorsResponse(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link MtermvectorsResponse}
     */
    public static final JsonpDeserializer<MtermvectorsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        MtermvectorsResponse::setupMtermvectorsResponseDeserializer
    );

    protected static void setupMtermvectorsResponseDeserializer(ObjectDeserializer<MtermvectorsResponse.Builder> op) {
        op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(MultiTermVectorsResult._DESERIALIZER), "docs");
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.docs.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        MtermvectorsResponse other = (MtermvectorsResponse) o;
        return this.docs.equals(other.docs);
    }
}
