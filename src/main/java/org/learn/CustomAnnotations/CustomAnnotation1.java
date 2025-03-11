package org.learn.CustomAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation1 {

    String value() default "";

    int abcd();
}