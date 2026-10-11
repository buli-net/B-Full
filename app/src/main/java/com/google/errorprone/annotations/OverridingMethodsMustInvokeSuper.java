package com.google.errorprone.annotations;
import java.lang.annotation.*;
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
public @interface OverridingMethodsMustInvokeSuper {  }
