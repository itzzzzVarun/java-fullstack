// 13. Write a java program to print power of a to b.

import java.util.Scanner;

public class Q13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter subscript..");
    int a = sc.nextInt();
    System.out.println("Enter superscript..");
    int b = sc.nextInt();
    sc.close();
    int res = power(a, b);
    System.out.println(res);
  }

  static int power(int a, int b) {
    int pow = 1;
    for (int i = 1; i <= b; i++) {
      pow = pow * a;
    }
    return pow;
  }
}
