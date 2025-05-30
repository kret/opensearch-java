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

package org.opensearch.client.opensearch._types.analysis;

import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.opensearch.client.json.JsonEnum;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import org.opensearch.client.util.TaggedUnion;
import org.opensearch.client.util.TaggedUnionUtils;

// typedef: _types.analysis.TokenizerDefinition

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class TokenizerDefinition implements TaggedUnion<TokenizerDefinition.Kind, TokenizerDefinitionVariant>, PlainJsonSerializable {
    /**
     * {@link TokenizerDefinition} variant kinds.
     */
    public enum Kind implements JsonEnum {
        CharGroup("char_group"),
        EdgeNgram("edge_ngram"),
        IcuTokenizer("icu_tokenizer"),
        Keyword("keyword"),
        KuromojiTokenizer("kuromoji_tokenizer"),
        Letter("letter"),
        Lowercase("lowercase"),
        Ngram("ngram"),
        NoriTokenizer("nori_tokenizer"),
        PathHierarchy("path_hierarchy"),
        Pattern("pattern"),
        SimplePattern("simple_pattern"),
        SimplePatternSplit("simple_pattern_split"),
        SmartcnTokenizer("smartcn_tokenizer"),
        Standard("standard"),
        UaxUrlEmail("uax_url_email"),
        Whitespace("whitespace");

        private final String jsonValue;

        Kind(String jsonValue) {
            this.jsonValue = jsonValue;
        }

        @Override
        public String jsonValue() {
            return jsonValue;
        }
    }

    private final Kind _kind;
    private final TokenizerDefinitionVariant _value;

    @Override
    public final Kind _kind() {
        return _kind;
    }

    @Override
    public final TokenizerDefinitionVariant _get() {
        return _value;
    }

    public TokenizerDefinition(TokenizerDefinitionVariant value) {
        this._kind = ApiTypeHelper.requireNonNull(value._tokenizerDefinitionKind(), this, "<variant kind>");
        this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");
    }

    private TokenizerDefinition(Builder builder) {
        this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
        this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");
    }

    public static TokenizerDefinition of(Function<TokenizerDefinition.Builder, ObjectBuilder<TokenizerDefinition>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Is this variant instance of kind {@code char_group}?
     */
    public boolean isCharGroup() {
        return _kind == Kind.CharGroup;
    }

    /**
     * Get the {@code char_group} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code char_group} kind.
     */
    public CharGroupTokenizer charGroup() {
        return TaggedUnionUtils.get(this, Kind.CharGroup);
    }

    /**
     * Is this variant instance of kind {@code edge_ngram}?
     */
    public boolean isEdgeNgram() {
        return _kind == Kind.EdgeNgram;
    }

    /**
     * Get the {@code edge_ngram} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code edge_ngram} kind.
     */
    public EdgeNGramTokenizer edgeNgram() {
        return TaggedUnionUtils.get(this, Kind.EdgeNgram);
    }

    /**
     * Is this variant instance of kind {@code icu_tokenizer}?
     */
    public boolean isIcuTokenizer() {
        return _kind == Kind.IcuTokenizer;
    }

    /**
     * Get the {@code icu_tokenizer} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code icu_tokenizer} kind.
     */
    public IcuTokenizer icuTokenizer() {
        return TaggedUnionUtils.get(this, Kind.IcuTokenizer);
    }

    /**
     * Is this variant instance of kind {@code keyword}?
     */
    public boolean isKeyword() {
        return _kind == Kind.Keyword;
    }

    /**
     * Get the {@code keyword} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code keyword} kind.
     */
    public KeywordTokenizer keyword() {
        return TaggedUnionUtils.get(this, Kind.Keyword);
    }

    /**
     * Is this variant instance of kind {@code kuromoji_tokenizer}?
     */
    public boolean isKuromojiTokenizer() {
        return _kind == Kind.KuromojiTokenizer;
    }

    /**
     * Get the {@code kuromoji_tokenizer} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code kuromoji_tokenizer} kind.
     */
    public KuromojiTokenizer kuromojiTokenizer() {
        return TaggedUnionUtils.get(this, Kind.KuromojiTokenizer);
    }

    /**
     * Is this variant instance of kind {@code letter}?
     */
    public boolean isLetter() {
        return _kind == Kind.Letter;
    }

    /**
     * Get the {@code letter} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code letter} kind.
     */
    public LetterTokenizer letter() {
        return TaggedUnionUtils.get(this, Kind.Letter);
    }

    /**
     * Is this variant instance of kind {@code lowercase}?
     */
    public boolean isLowercase() {
        return _kind == Kind.Lowercase;
    }

    /**
     * Get the {@code lowercase} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code lowercase} kind.
     */
    public LowercaseTokenizer lowercase() {
        return TaggedUnionUtils.get(this, Kind.Lowercase);
    }

    /**
     * Is this variant instance of kind {@code ngram}?
     */
    public boolean isNgram() {
        return _kind == Kind.Ngram;
    }

    /**
     * Get the {@code ngram} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code ngram} kind.
     */
    public NGramTokenizer ngram() {
        return TaggedUnionUtils.get(this, Kind.Ngram);
    }

    /**
     * Is this variant instance of kind {@code nori_tokenizer}?
     */
    public boolean isNoriTokenizer() {
        return _kind == Kind.NoriTokenizer;
    }

    /**
     * Get the {@code nori_tokenizer} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code nori_tokenizer} kind.
     */
    public NoriTokenizer noriTokenizer() {
        return TaggedUnionUtils.get(this, Kind.NoriTokenizer);
    }

    /**
     * Is this variant instance of kind {@code path_hierarchy}?
     */
    public boolean isPathHierarchy() {
        return _kind == Kind.PathHierarchy;
    }

    /**
     * Get the {@code path_hierarchy} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code path_hierarchy} kind.
     */
    public PathHierarchyTokenizer pathHierarchy() {
        return TaggedUnionUtils.get(this, Kind.PathHierarchy);
    }

    /**
     * Is this variant instance of kind {@code pattern}?
     */
    public boolean isPattern() {
        return _kind == Kind.Pattern;
    }

    /**
     * Get the {@code pattern} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code pattern} kind.
     */
    public PatternTokenizer pattern() {
        return TaggedUnionUtils.get(this, Kind.Pattern);
    }

    /**
     * Is this variant instance of kind {@code simple_pattern}?
     */
    public boolean isSimplePattern() {
        return _kind == Kind.SimplePattern;
    }

    /**
     * Get the {@code simple_pattern} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code simple_pattern} kind.
     */
    public SimplePatternTokenizer simplePattern() {
        return TaggedUnionUtils.get(this, Kind.SimplePattern);
    }

    /**
     * Is this variant instance of kind {@code simple_pattern_split}?
     */
    public boolean isSimplePatternSplit() {
        return _kind == Kind.SimplePatternSplit;
    }

    /**
     * Get the {@code simple_pattern_split} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code simple_pattern_split} kind.
     */
    public SimplePatternSplitTokenizer simplePatternSplit() {
        return TaggedUnionUtils.get(this, Kind.SimplePatternSplit);
    }

    /**
     * Is this variant instance of kind {@code smartcn_tokenizer}?
     */
    public boolean isSmartcnTokenizer() {
        return _kind == Kind.SmartcnTokenizer;
    }

    /**
     * Get the {@code smartcn_tokenizer} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code smartcn_tokenizer} kind.
     */
    public SmartcnTokenizer smartcnTokenizer() {
        return TaggedUnionUtils.get(this, Kind.SmartcnTokenizer);
    }

    /**
     * Is this variant instance of kind {@code standard}?
     */
    public boolean isStandard() {
        return _kind == Kind.Standard;
    }

    /**
     * Get the {@code standard} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code standard} kind.
     */
    public StandardTokenizer standard() {
        return TaggedUnionUtils.get(this, Kind.Standard);
    }

    /**
     * Is this variant instance of kind {@code uax_url_email}?
     */
    public boolean isUaxUrlEmail() {
        return _kind == Kind.UaxUrlEmail;
    }

    /**
     * Get the {@code uax_url_email} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code uax_url_email} kind.
     */
    public UaxEmailUrlTokenizer uaxUrlEmail() {
        return TaggedUnionUtils.get(this, Kind.UaxUrlEmail);
    }

    /**
     * Is this variant instance of kind {@code whitespace}?
     */
    public boolean isWhitespace() {
        return _kind == Kind.Whitespace;
    }

    /**
     * Get the {@code whitespace} variant value.
     *
     * @throws IllegalStateException if the current variant is not the {@code whitespace} kind.
     */
    public WhitespaceTokenizer whitespace() {
        return TaggedUnionUtils.get(this, Kind.Whitespace);
    }

    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        mapper.serialize(_value, generator);
    }

    @Nonnull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Nonnull
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TokenizerDefinition> {
        private Kind _kind;
        private TokenizerDefinitionVariant _value;

        public Builder() {}

        private Builder(TokenizerDefinition o) {
            this._kind = o._kind;
            this._value = o._value;
        }

        public ObjectBuilder<TokenizerDefinition> charGroup(CharGroupTokenizer v) {
            this._kind = Kind.CharGroup;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> charGroup(Function<CharGroupTokenizer.Builder, ObjectBuilder<CharGroupTokenizer>> fn) {
            return this.charGroup(fn.apply(new CharGroupTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> edgeNgram(EdgeNGramTokenizer v) {
            this._kind = Kind.EdgeNgram;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> edgeNgram(Function<EdgeNGramTokenizer.Builder, ObjectBuilder<EdgeNGramTokenizer>> fn) {
            return this.edgeNgram(fn.apply(new EdgeNGramTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> icuTokenizer(IcuTokenizer v) {
            this._kind = Kind.IcuTokenizer;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> icuTokenizer(Function<IcuTokenizer.Builder, ObjectBuilder<IcuTokenizer>> fn) {
            return this.icuTokenizer(fn.apply(new IcuTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> keyword(KeywordTokenizer v) {
            this._kind = Kind.Keyword;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> keyword(Function<KeywordTokenizer.Builder, ObjectBuilder<KeywordTokenizer>> fn) {
            return this.keyword(fn.apply(new KeywordTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> kuromojiTokenizer(KuromojiTokenizer v) {
            this._kind = Kind.KuromojiTokenizer;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> kuromojiTokenizer(
            Function<KuromojiTokenizer.Builder, ObjectBuilder<KuromojiTokenizer>> fn
        ) {
            return this.kuromojiTokenizer(fn.apply(new KuromojiTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> letter(LetterTokenizer v) {
            this._kind = Kind.Letter;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> letter(Function<LetterTokenizer.Builder, ObjectBuilder<LetterTokenizer>> fn) {
            return this.letter(fn.apply(new LetterTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> lowercase(LowercaseTokenizer v) {
            this._kind = Kind.Lowercase;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> lowercase(Function<LowercaseTokenizer.Builder, ObjectBuilder<LowercaseTokenizer>> fn) {
            return this.lowercase(fn.apply(new LowercaseTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> ngram(NGramTokenizer v) {
            this._kind = Kind.Ngram;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> ngram(Function<NGramTokenizer.Builder, ObjectBuilder<NGramTokenizer>> fn) {
            return this.ngram(fn.apply(new NGramTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> noriTokenizer(NoriTokenizer v) {
            this._kind = Kind.NoriTokenizer;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> noriTokenizer(Function<NoriTokenizer.Builder, ObjectBuilder<NoriTokenizer>> fn) {
            return this.noriTokenizer(fn.apply(new NoriTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> pathHierarchy(PathHierarchyTokenizer v) {
            this._kind = Kind.PathHierarchy;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> pathHierarchy(
            Function<PathHierarchyTokenizer.Builder, ObjectBuilder<PathHierarchyTokenizer>> fn
        ) {
            return this.pathHierarchy(fn.apply(new PathHierarchyTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> pattern(PatternTokenizer v) {
            this._kind = Kind.Pattern;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> pattern(Function<PatternTokenizer.Builder, ObjectBuilder<PatternTokenizer>> fn) {
            return this.pattern(fn.apply(new PatternTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> simplePattern(SimplePatternTokenizer v) {
            this._kind = Kind.SimplePattern;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> simplePattern(
            Function<SimplePatternTokenizer.Builder, ObjectBuilder<SimplePatternTokenizer>> fn
        ) {
            return this.simplePattern(fn.apply(new SimplePatternTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> simplePatternSplit(SimplePatternSplitTokenizer v) {
            this._kind = Kind.SimplePatternSplit;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> simplePatternSplit(
            Function<SimplePatternSplitTokenizer.Builder, ObjectBuilder<SimplePatternSplitTokenizer>> fn
        ) {
            return this.simplePatternSplit(fn.apply(new SimplePatternSplitTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> smartcnTokenizer(SmartcnTokenizer v) {
            this._kind = Kind.SmartcnTokenizer;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> smartcnTokenizer(Function<SmartcnTokenizer.Builder, ObjectBuilder<SmartcnTokenizer>> fn) {
            return this.smartcnTokenizer(fn.apply(new SmartcnTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> standard(StandardTokenizer v) {
            this._kind = Kind.Standard;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> standard(Function<StandardTokenizer.Builder, ObjectBuilder<StandardTokenizer>> fn) {
            return this.standard(fn.apply(new StandardTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> uaxUrlEmail(UaxEmailUrlTokenizer v) {
            this._kind = Kind.UaxUrlEmail;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> uaxUrlEmail(
            Function<UaxEmailUrlTokenizer.Builder, ObjectBuilder<UaxEmailUrlTokenizer>> fn
        ) {
            return this.uaxUrlEmail(fn.apply(new UaxEmailUrlTokenizer.Builder()).build());
        }

        public ObjectBuilder<TokenizerDefinition> whitespace(WhitespaceTokenizer v) {
            this._kind = Kind.Whitespace;
            this._value = v;
            return this;
        }

        public ObjectBuilder<TokenizerDefinition> whitespace(Function<WhitespaceTokenizer.Builder, ObjectBuilder<WhitespaceTokenizer>> fn) {
            return this.whitespace(fn.apply(new WhitespaceTokenizer.Builder()).build());
        }

        @Override
        public TokenizerDefinition build() {
            _checkSingleUse();
            return new TokenizerDefinition(this);
        }
    }

    protected static void setupTokenizerDefinitionDeserializer(ObjectDeserializer<Builder> op) {
        op.add(Builder::charGroup, CharGroupTokenizer._DESERIALIZER, "char_group");
        op.add(Builder::edgeNgram, EdgeNGramTokenizer._DESERIALIZER, "edge_ngram");
        op.add(Builder::icuTokenizer, IcuTokenizer._DESERIALIZER, "icu_tokenizer");
        op.add(Builder::keyword, KeywordTokenizer._DESERIALIZER, "keyword");
        op.add(Builder::kuromojiTokenizer, KuromojiTokenizer._DESERIALIZER, "kuromoji_tokenizer");
        op.add(Builder::letter, LetterTokenizer._DESERIALIZER, "letter");
        op.add(Builder::lowercase, LowercaseTokenizer._DESERIALIZER, "lowercase");
        op.add(Builder::ngram, NGramTokenizer._DESERIALIZER, "ngram");
        op.add(Builder::noriTokenizer, NoriTokenizer._DESERIALIZER, "nori_tokenizer");
        op.add(Builder::pathHierarchy, PathHierarchyTokenizer._DESERIALIZER, "path_hierarchy");
        op.add(Builder::pattern, PatternTokenizer._DESERIALIZER, "pattern");
        op.add(Builder::simplePattern, SimplePatternTokenizer._DESERIALIZER, "simple_pattern");
        op.add(Builder::simplePatternSplit, SimplePatternSplitTokenizer._DESERIALIZER, "simple_pattern_split");
        op.add(Builder::smartcnTokenizer, SmartcnTokenizer._DESERIALIZER, "smartcn_tokenizer");
        op.add(Builder::standard, StandardTokenizer._DESERIALIZER, "standard");
        op.add(Builder::uaxUrlEmail, UaxEmailUrlTokenizer._DESERIALIZER, "uax_url_email");
        op.add(Builder::whitespace, WhitespaceTokenizer._DESERIALIZER, "whitespace");
        op.setTypeProperty("type", null);
    }

    public static final JsonpDeserializer<TokenizerDefinition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        TokenizerDefinition::setupTokenizerDefinitionDeserializer,
        Builder::build
    );

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Objects.hashCode(this._kind);
        result = 31 * result + Objects.hashCode(this._value);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        TokenizerDefinition other = (TokenizerDefinition) o;
        return Objects.equals(this._kind, other._kind) && Objects.equals(this._value, other._value);
    }
}
