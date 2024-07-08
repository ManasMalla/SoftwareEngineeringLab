import java.util.List;
import java.util.ArrayList;

public class Grapher {

  public static void drawGraph(int xMax, int yMax, List<GraphPoint> points) {
    // Create a 2D array to represent the graph
    String[][] graph = new String[yMax + 1][xMax + 1];

    // Initialize the graph with spaces
    for (int y = 0; y <= yMax; y++) {
      for (int x = 0; x <= xMax; x++) {
        graph[y][x] = "   ";
      }
    }

    // Plot the points
    for (GraphPoint point : points) {
      if (point.x >= 0 && point.x <= xMax && point.y >= 0 && point.y <= yMax) {
        graph[yMax - point.y][point.x] = " * "; // Plot the point on the graph
      }
    }

    // Print the graph
    for (int y = 0; y <= yMax; y++) {
      System.out.print(String.valueOf(yMax - y));
      for (int x = 0; x <= xMax; x++) {
        System.out.print(graph[y][x]);
      }
      System.out.println();
    }

    // Print the x-axis labels
    System.out.print(" ");
    for (int x = 0; x <= xMax; x++) {
      System.out.print(" " + x + " ");
    }
    System.out.println();
  }
}