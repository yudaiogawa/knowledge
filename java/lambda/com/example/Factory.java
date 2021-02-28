package lambda.com.example;

public class Factory {

  public static Example createExample() {
    return () -> System.out.println("lambda function");
  }
}
