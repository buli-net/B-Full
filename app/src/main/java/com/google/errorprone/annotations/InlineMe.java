package com.google.errorprone.annotations;
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface InlineMe { String replacement(); String[] imports() default {}; }
