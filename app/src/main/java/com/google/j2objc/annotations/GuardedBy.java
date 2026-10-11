package com.google.j2objc.annotations;
import java.lang.annotation.*;
@Documented @Retention(RetentionPolicy.CLASS) @Target({ElementType.FIELD,ElementType.METHOD}) public @interface GuardedBy { String value(); }
