package org.sonarqube.modulespring;

import org.sonarqube.module2.Module2;
import org.springframework.stereotype.Component;

@Component
public class SpringBootCallModule2 {

    private final Module2 module2 = new Module2();

    public SpringBootCallModule2(){
        System.out.println("CallModule2 constructor called");
    }

    public void callModule2BySpringBootApp() {
        module2.coveredBySpringBootApplication();
    }

    public void neverCalledInSpringBootApp2() {
        System.out.println("This method is not called in Spring Boot application test");
    }

}
