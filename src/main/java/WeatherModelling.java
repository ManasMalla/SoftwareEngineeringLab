import java.util.*;

class WeatherModelling {

  public static GraphPoint calculate(int a, int b, int c, int t) {
    return new GraphPoint(t, a * t * t + b * t + c);
  }

  public static void main(String[] args) {
    // title
    System.out.println("Weather Modelling using Quadratic Equations\n");
    // explain about quadratic equations
    System.out.println(
        "Quadratic equations are a type of equation that can be expressed in the form of ax^2+bx+c and can be solved using the quadratic formula.\n\nTemperature is a fine example of using quadratic equations.");
    // Hard coding the co-efficients of the quadratic equation
    int a = 1;
    int b = 1;
    int c = 1;
    ArrayList<GraphPoint> points = new ArrayList<GraphPoint>();
    for (int i = 0; i < 3; i++) {
      GraphPoint point = calculate(a, b, c, i);
      points.add(point);
    }
    Grapher.drawGraph(8, 8, points);
  }
}