package com.google.j2objc.annotations;
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS) @Target({ElementType.TYPE}) public @interface ReflectionSupport { Level value() default Level FULL; enum Level { FULL, PARTIAL, NONE; } }
