/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.codegen.model;

import java.util.Collection;
import java.util.List;
import org.opensearch.client.codegen.model.types.TypeRef;
import org.opensearch.client.codegen.model.types.Types;
import org.opensearch.client.codegen.transformer.overrides.ShouldGenerate;

public class ArrayShape extends ObjectShape {
    private final Field valueBodyField;

    public ArrayShape(
        Namespace parent,
        String className,
        TypeRef arrayType,
        String typedefName,
        String description,
        ShouldGenerate shouldGenerate
    ) {
        super(parent, className, typedefName, description, shouldGenerate);
        this.valueBodyField = Field.builder()
            .withName("valueBody")
            .withType(arrayType)
            .withRequired(true)
            .withDescription("Response value.")
            .build();
        tryAddReference(ReferenceKind.Field, arrayType);
    }

    @Override
    public Collection<Field> getFields() {
        return List.of(valueBodyField);
    }

    @Override
    public Collection<TypeRef> getAnnotations() {
        return List.of(Types.Client.Json.JsonpDeserializable);
    }

    public Field getValueBodyField() {
        return valueBodyField;
    }

    @Override
    public boolean canBeSingleton() {
        return false;
    }
}
