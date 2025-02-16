# Multi-module Maven Example

This project creates JaCoCo's aggregate XML report to be able to report coverage across modules as well as unit test
coverage inside the module.  It specifically utilises a Springboot application and tests this application to get
coverage from unit tests, surefire tests and failsafe tests including code that is annotated.  It does check that the
annotation is being called but the Aspect is quite simple and does not create any code that can be specifically tested.

Tests can be run using the folling:

```mvn clean verify```

It will create a report in the target directory of the tests module -> tests/target/site/jacoco-aggregate/index.html
Some browsers seem not to want to open the report but I've had success with Firefox and the intellij internal browser.

The initial version of this code was taken from the sonarqube scanner maven instructions but extended in the following
ways:
1) It adds a Springboot application that calls the modules specifically
2) It adds differentiation betwen maven surefire and maven failsafe (IntegrationTest) tests
3) It adds an Aspect annotation to show that annotations can be added and tested - aspect requires another java agent

While the testing doesn't directly test that the anotation is called you can see if it is called because it will output
"Before annotated method" in the logs.

## Documentation Originated From 

[SonarScanner for Maven](https://docs.sonarsource.com/sonarqube/latest/analyzing-source-code/scanners/sonarscanner-for-maven/)
