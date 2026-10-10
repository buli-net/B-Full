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

/** Indicates that a type use is non-null. */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface NonNull {}
