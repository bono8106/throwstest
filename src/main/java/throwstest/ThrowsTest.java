package throwstest;

public class ThrowsTest {

  public static class ThrowingClass implements ThrowingInterface {
    public void throwingMethod() throws InterruptedException {
      Thread.sleep(1000);
    }
  }

}
