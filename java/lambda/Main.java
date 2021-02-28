package lambda;

import lambda.model.Item;

import java.util.function.Supplier;

import lambda.com.example.Example;
import lambda.com.example.Factory;
import lambda.com.example.Process;

public class Main {

  public static void main(String[] args) {

    Example example = Factory.createExample();
    example.run();

    Process process = new Process();
    process.process(() -> System.out.println("lambda function"));

    // method chain
    Item.save(i -> i.id("id").name("name").desc("desc").price(100));

    Supplier<Double> s = Math::random;
    System.out.println(s.get());

  }
}
