package try_with_resources;

public class AutoCloseableImpl implements AutoCloseable {
  @Override
  public void close() {
    System.out.println("close");
  }
}
