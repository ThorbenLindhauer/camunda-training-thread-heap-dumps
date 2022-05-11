package org.camunda.support.training.threaddumps;

public class Main {

  public static void main(String[] args) throws Exception {
    callMeFirst();
  }

  public static void callMeFirst() throws Exception {
    callMeSecond();
  }

  public static void callMeSecond() throws Exception {
    Thread.sleep(60000L);
  }

}
