package org.sonarqube;

import org.junit.jupiter.api.Test;
import org.sonarqube.modulespring.SpringBootCallModule1;
import org.sonarqube.modulespring.SpringBootCallModule2;
import org.sonarqube.modulespring.MySpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MySpringBootApplication.class)
public class ModulesTestSpringIT {

    @Autowired
    SpringBootCallModule1 module1;

    @Autowired
    SpringBootCallModule2 module2;

    @Test
    void applicationCanCallModule1() {
        module1.callModule1BySpringBootApp();
    }

    @Test
    void applicationCanCallModule2() {
        module2.callModule2BySpringBootApp();
    }
}
