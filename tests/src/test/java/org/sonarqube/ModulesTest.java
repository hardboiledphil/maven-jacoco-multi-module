package org.sonarqube;

import org.junit.jupiter.api.Test;
import org.sonarqube.module1.Module1;
import org.sonarqube.module2.Module2;

public class ModulesTest {

  @Test
  public void integrationTest1() {
    new Module1().coveredBySurefireTest();
  }

  @Test
  public void integrationTest2() {
    new Module2().coveredBySurefireTest();
  }

}
