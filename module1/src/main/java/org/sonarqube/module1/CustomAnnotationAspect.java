package org.sonarqube.module1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CustomAnnotationAspect {

    @Before("@annotation(org.sonarqube.module1.CustomAnnotation)")
    public void beforeAnnotatedMethod() {
        System.out.println("Before annotated method");
    }
}
