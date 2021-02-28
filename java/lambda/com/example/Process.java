package lambda.com.example;

public class Process {

  public void process(Example example) {
    System.out.println("process start ...");
    example.run();
    System.out.println("process end");
  }
}
