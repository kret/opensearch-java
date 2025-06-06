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

package org.opensearch.client.opensearch.indices;

import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.opensearch.client.json.JsonData;
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

// typedef: indices.IndexTemplate

/**
 * The configuration for an index template.
 */
@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class IndexTemplate implements PlainJsonSerializable, ToCopyableBuilder<IndexTemplate.Builder, IndexTemplate> {

    @Nullable
    private final Boolean allowAutoCreate;

    @Nonnull
    private final List<String> composedOf;

    @Nullable
    private final IndexTemplateDataStreamConfiguration dataStream;

    @Nonnull
    private final List<String> indexPatterns;

    @Nonnull
    private final Map<String, JsonData> meta;

    @Nullable
    private final Long priority;

    @Nullable
    private final IndexTemplateSummary template;

    @Nullable
    private final Long version;

    // ---------------------------------------------------------------------------------------------

    private IndexTemplate(Builder builder) {
        this.allowAutoCreate = builder.allowAutoCreate;
        this.composedOf = ApiTypeHelper.unmodifiable(builder.composedOf);
        this.dataStream = builder.dataStream;
        this.indexPatterns = ApiTypeHelper.unmodifiableRequired(builder.indexPatterns, this, "indexPatterns");
        this.meta = ApiTypeHelper.unmodifiable(builder.meta);
        this.priority = builder.priority;
        this.template = builder.template;
        this.version = builder.version;
    }

    public static IndexTemplate of(Function<IndexTemplate.Builder, ObjectBuilder<IndexTemplate>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Whether the template allows automatic index creation.
     * <p>
     * API name: {@code allow_auto_create}
     * </p>
     */
    @Nullable
    public final Boolean allowAutoCreate() {
        return this.allowAutoCreate;
    }

    /**
     * An ordered list of component template names. Component templates are merged in the order specified, meaning that the last component
     * template specified has the highest precedence.
     * <p>
     * API name: {@code composed_of}
     * </p>
     */
    @Nonnull
    public final List<String> composedOf() {
        return this.composedOf;
    }

    /**
     * API name: {@code data_stream}
     */
    @Nullable
    public final IndexTemplateDataStreamConfiguration dataStream() {
        return this.dataStream;
    }

    /**
     * Required - API name: {@code index_patterns}
     */
    @Nonnull
    public final List<String> indexPatterns() {
        return this.indexPatterns;
    }

    /**
     * API name: {@code _meta}
     */
    @Nonnull
    public final Map<String, JsonData> meta() {
        return this.meta;
    }

    /**
     * The priority to determine index template precedence when a new data stream or index is created. The index template with the highest
     * priority is chosen. If no priority is specified the template is treated as though it is of priority 0 (lowest priority). This number
     * is not automatically generated by OpenSearch.
     * <p>
     * API name: {@code priority}
     * </p>
     */
    @Nullable
    public final Long priority() {
        return this.priority;
    }

    /**
     * API name: {@code template}
     */
    @Nullable
    public final IndexTemplateSummary template() {
        return this.template;
    }

    /**
     * API name: {@code version}
     */
    @Nullable
    public final Long version() {
        return this.version;
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
        if (this.allowAutoCreate != null) {
            generator.writeKey("allow_auto_create");
            generator.write(this.allowAutoCreate);
        }

        if (ApiTypeHelper.isDefined(this.composedOf)) {
            generator.writeKey("composed_of");
            generator.writeStartArray();
            for (String item0 : this.composedOf) {
                generator.write(item0);
            }
            generator.writeEnd();
        }

        if (this.dataStream != null) {
            generator.writeKey("data_stream");
            this.dataStream.serialize(generator, mapper);
        }

        generator.writeKey("index_patterns");
        generator.writeStartArray();
        for (String item0 : this.indexPatterns) {
            generator.write(item0);
        }
        generator.writeEnd();

        if (ApiTypeHelper.isDefined(this.meta)) {
            generator.writeKey("_meta");
            generator.writeStartObject();
            for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
                generator.writeKey(item0.getKey());
                item0.getValue().serialize(generator, mapper);
            }
            generator.writeEnd();
        }

        if (this.priority != null) {
            generator.writeKey("priority");
            generator.write(this.priority);
        }

        if (this.template != null) {
            generator.writeKey("template");
            this.template.serialize(generator, mapper);
        }

        if (this.version != null) {
            generator.writeKey("version");
            generator.write(this.version);
        }
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
     * Builder for {@link IndexTemplate}.
     */
    public static class Builder extends ObjectBuilderBase implements CopyableBuilder<Builder, IndexTemplate> {
        @Nullable
        private Boolean allowAutoCreate;
        @Nullable
        private List<String> composedOf;
        @Nullable
        private IndexTemplateDataStreamConfiguration dataStream;
        private List<String> indexPatterns;
        @Nullable
        private Map<String, JsonData> meta;
        @Nullable
        private Long priority;
        @Nullable
        private IndexTemplateSummary template;
        @Nullable
        private Long version;

        public Builder() {}

        private Builder(IndexTemplate o) {
            this.allowAutoCreate = o.allowAutoCreate;
            this.composedOf = _listCopy(o.composedOf);
            this.dataStream = o.dataStream;
            this.indexPatterns = _listCopy(o.indexPatterns);
            this.meta = _mapCopy(o.meta);
            this.priority = o.priority;
            this.template = o.template;
            this.version = o.version;
        }

        private Builder(Builder o) {
            this.allowAutoCreate = o.allowAutoCreate;
            this.composedOf = _listCopy(o.composedOf);
            this.dataStream = o.dataStream;
            this.indexPatterns = _listCopy(o.indexPatterns);
            this.meta = _mapCopy(o.meta);
            this.priority = o.priority;
            this.template = o.template;
            this.version = o.version;
        }

        @Override
        @Nonnull
        public Builder copy() {
            return new Builder(this);
        }

        /**
         * Whether the template allows automatic index creation.
         * <p>
         * API name: {@code allow_auto_create}
         * </p>
         */
        @Nonnull
        public final Builder allowAutoCreate(@Nullable Boolean value) {
            this.allowAutoCreate = value;
            return this;
        }

        /**
         * An ordered list of component template names. Component templates are merged in the order specified, meaning that the last
         * component template specified has the highest precedence.
         * <p>
         * API name: {@code composed_of}
         * </p>
         *
         * <p>
         * Adds all elements of <code>list</code> to <code>composedOf</code>.
         * </p>
         */
        @Nonnull
        public final Builder composedOf(List<String> list) {
            this.composedOf = _listAddAll(this.composedOf, list);
            return this;
        }

        /**
         * An ordered list of component template names. Component templates are merged in the order specified, meaning that the last
         * component template specified has the highest precedence.
         * <p>
         * API name: {@code composed_of}
         * </p>
         *
         * <p>
         * Adds one or more values to <code>composedOf</code>.
         * </p>
         */
        @Nonnull
        public final Builder composedOf(String value, String... values) {
            this.composedOf = _listAdd(this.composedOf, value, values);
            return this;
        }

        /**
         * API name: {@code data_stream}
         */
        @Nonnull
        public final Builder dataStream(@Nullable IndexTemplateDataStreamConfiguration value) {
            this.dataStream = value;
            return this;
        }

        /**
         * API name: {@code data_stream}
         */
        @Nonnull
        public final Builder dataStream(
            Function<IndexTemplateDataStreamConfiguration.Builder, ObjectBuilder<IndexTemplateDataStreamConfiguration>> fn
        ) {
            return dataStream(fn.apply(new IndexTemplateDataStreamConfiguration.Builder()).build());
        }

        /**
         * Required - API name: {@code index_patterns}
         *
         * <p>
         * Adds all elements of <code>list</code> to <code>indexPatterns</code>.
         * </p>
         */
        @Nonnull
        public final Builder indexPatterns(List<String> list) {
            this.indexPatterns = _listAddAll(this.indexPatterns, list);
            return this;
        }

        /**
         * Required - API name: {@code index_patterns}
         *
         * <p>
         * Adds one or more values to <code>indexPatterns</code>.
         * </p>
         */
        @Nonnull
        public final Builder indexPatterns(String value, String... values) {
            this.indexPatterns = _listAdd(this.indexPatterns, value, values);
            return this;
        }

        /**
         * API name: {@code _meta}
         *
         * <p>
         * Adds all elements of <code>map</code> to <code>meta</code>.
         * </p>
         */
        @Nonnull
        public final Builder meta(Map<String, JsonData> map) {
            this.meta = _mapPutAll(this.meta, map);
            return this;
        }

        /**
         * API name: {@code _meta}
         *
         * <p>
         * Adds an entry to <code>meta</code>.
         * </p>
         */
        @Nonnull
        public final Builder meta(String key, JsonData value) {
            this.meta = _mapPut(this.meta, key, value);
            return this;
        }

        /**
         * The priority to determine index template precedence when a new data stream or index is created. The index template with the
         * highest priority is chosen. If no priority is specified the template is treated as though it is of priority 0 (lowest priority).
         * This number is not automatically generated by OpenSearch.
         * <p>
         * API name: {@code priority}
         * </p>
         */
        @Nonnull
        public final Builder priority(@Nullable Long value) {
            this.priority = value;
            return this;
        }

        /**
         * API name: {@code template}
         */
        @Nonnull
        public final Builder template(@Nullable IndexTemplateSummary value) {
            this.template = value;
            return this;
        }

        /**
         * API name: {@code template}
         */
        @Nonnull
        public final Builder template(Function<IndexTemplateSummary.Builder, ObjectBuilder<IndexTemplateSummary>> fn) {
            return template(fn.apply(new IndexTemplateSummary.Builder()).build());
        }

        /**
         * API name: {@code version}
         */
        @Nonnull
        public final Builder version(@Nullable Long value) {
            this.version = value;
            return this;
        }

        /**
         * Builds a {@link IndexTemplate}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public IndexTemplate build() {
            _checkSingleUse();

            return new IndexTemplate(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link IndexTemplate}
     */
    public static final JsonpDeserializer<IndexTemplate> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        IndexTemplate::setupIndexTemplateDeserializer
    );

    protected static void setupIndexTemplateDeserializer(ObjectDeserializer<IndexTemplate.Builder> op) {
        op.add(Builder::allowAutoCreate, JsonpDeserializer.booleanDeserializer(), "allow_auto_create");
        op.add(Builder::composedOf, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "composed_of");
        op.add(Builder::dataStream, IndexTemplateDataStreamConfiguration._DESERIALIZER, "data_stream");
        op.add(Builder::indexPatterns, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "index_patterns");
        op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
        op.add(Builder::priority, JsonpDeserializer.longDeserializer(), "priority");
        op.add(Builder::template, IndexTemplateSummary._DESERIALIZER, "template");
        op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this.allowAutoCreate);
        result = 31 * result + Objects.hashCode(this.composedOf);
        result = 31 * result + Objects.hashCode(this.dataStream);
        result = 31 * result + this.indexPatterns.hashCode();
        result = 31 * result + Objects.hashCode(this.meta);
        result = 31 * result + Objects.hashCode(this.priority);
        result = 31 * result + Objects.hashCode(this.template);
        result = 31 * result + Objects.hashCode(this.version);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        IndexTemplate other = (IndexTemplate) o;
        return Objects.equals(this.allowAutoCreate, other.allowAutoCreate)
            && Objects.equals(this.composedOf, other.composedOf)
            && Objects.equals(this.dataStream, other.dataStream)
            && this.indexPatterns.equals(other.indexPatterns)
            && Objects.equals(this.meta, other.meta)
            && Objects.equals(this.priority, other.priority)
            && Objects.equals(this.template, other.template)
            && Objects.equals(this.version, other.version);
    }
}
