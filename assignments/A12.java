import java.util.*;

public class A12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int result = secondBig(a, b, c);
    System.out.println(result);
    sc.close();
  }

  static int secondBig(int a, int b, int c) {
    if (a == b) {
      if (a < c) {
        return a;
      } else {
        return c;
      }
    }
    if (b == c) {
      if (b < a) {
        return b;
      } else {
        return a;
      }
    }
    if (a == c) {
      if (a < b) {
        return a;
      } else {
        return b;
      }
    }
    int max = Math.max(a, b);
    int max_number = Math.max(c, max);
    int min = Math.min(a, b); 
    int min_number = Math.min(c, min);
    return a + b + c - max_number - min_number;
  }
}
