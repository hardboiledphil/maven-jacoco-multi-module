package org.sonarqube.modulespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

import static org.springframework.context.annotation.EnableLoadTimeWeaving.AspectJWeaving.ENABLED;

@SpringBootApplication
@EnableLoadTimeWeaving(aspectjWeaving = ENABLED)
public class MySpringBootApplication {

    public static void main(final String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }

}