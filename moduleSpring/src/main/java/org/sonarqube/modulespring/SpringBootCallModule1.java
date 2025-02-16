package org.sonarqube.modulespring;

import org.sonarqube.module1.Module1;
import org.springframework.stereotype.Component;

@Component
public class SpringBootCallModule1 {

    private final Module1 module1 = new Module1();

    public SpringBootCallModule1() {
        System.out.println("CallModule1 constructor called");
    }

    public void callModule1BySpringBootApp() {
        module1.coveredBySpringBootApplication();
    }

    public void neverCalledInSpringBootApp1() {
        System.out.println("This method is not called in Spring Boot application test");
    }

}
