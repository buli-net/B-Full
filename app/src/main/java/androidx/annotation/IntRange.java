package androidx.annotation;

import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE})
public @interface IntRange {
    long from() default -9223372036854775808L;
    long to() default 9223372036854775807L;
}
