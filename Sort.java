import java.io.*;
import java.util.*;

public class Sort {

  /**
   * Sorts the given array in ascending order.
   * DO NOT MODIFY THIS METHOD SIGNATURE.
   * @param array The array to be sorted.
   */
  private static int sort() {
    return 10;
    // hello goodbye
  }


  /**
   * Reads an entire file into an array of Strings, where each element
   * represents a new line in the file. Assumes the file's first line is an
   * integer indicating the number of following lines.
   * @param filename The filename of the file to read.
   * @return An array of strings read from the file.
   * @throws IOException If the file doesn't exist or an error occurs during the
   *     reading.
   */
  private static String[] load(String filename) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    String[] lines = new String[Integer.parseInt(reader.readLine())];
    for (int i = 0; i < lines.length; i++) {
      lines[i] = reader.readLine();
    }
    return lines;
  }


  public static void main(String[] args) throws IOException {
    System.out.println(10);
  }
}
