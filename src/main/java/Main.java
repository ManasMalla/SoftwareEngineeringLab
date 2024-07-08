// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Software Engineering Lab");
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("/n");
    System.out.println("List of experiements\n1. Weather Modelling using Quadratic Equations.");
    System.out.println("Choose an input: ");
    int input = scanner.nextInt();
    switch (input){
      case 1:
        WeatherModelling wModel = new WeatherModelling();
        wModel.main(args);
        break;
      default: 
        System.out.println("Invalid input");
    }
    scanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}