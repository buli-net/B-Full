/*
 * Copyright 2022 The JSpecify Authors.
 * Licensed under the Apache License, Version 2.0.
 */
package org.jspecify.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Marks declarations in the annotated scope as null-marked by default. */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.MODULE, ElementType.PACKAGE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface NullMarked {}
