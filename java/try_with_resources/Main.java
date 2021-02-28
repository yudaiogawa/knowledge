package try_with_resources;

public class Main {
  public static void main(String[] args) {
    try (AutoCloseableImpl test = new AutoCloseableImpl()) {
      System.out.println("try block");
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      System.out.println("finally block");
    }
  }
}
