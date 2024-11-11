// 16. Write a java program to Write sum all even number upto 100.

import java.util.Scanner;

public class Q16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = addEven(n);
    sc.close();
    System.out.println(res);
  }

  static int addEven(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
    }
    return sum;
  }
}
