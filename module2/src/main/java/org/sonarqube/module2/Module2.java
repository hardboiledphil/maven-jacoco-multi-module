package org.sonarqube.module2;

public class Module2 {

  public void coveredByUnitTest() {
    System.out.println("This method is covered by unit test");
  }

  public void coveredBySurefireTest() {
    System.out.println("This method is covered by surefire test");
  }

  public void uncovered() {System.out.println("This method is not covered");}

  public void coveredByFailsafeTest() {
    System.out.println("This method is covered by failsafe test");
  }

  public void coveredBySpringBootApplication() {
    System.out.println("This method is covered by Spring Boot application - NOT ANNOTATED");
  }

}
