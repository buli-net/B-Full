package androidx.annotation;

import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.PACKAGE})
public @interface ChecksSdkIntAtLeast {
    int api() default 0;
    String codename() default "";
    int extension() default 0;
    int parameter() default 0;
}
