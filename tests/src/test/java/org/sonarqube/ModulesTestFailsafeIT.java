package org.sonarqube;

import org.junit.jupiter.api.Test;
import org.sonarqube.module1.Module1;
import org.sonarqube.module2.Module2;

public class ModulesTestFailsafeIT {

  @Test
  public void integrationTest1a() {
    new Module1().coveredByFailsafeTest();
  }

  @Test
  public void integrationTest2a() {
    new Module2().coveredByFailsafeTest();
  }

}
