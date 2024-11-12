// 1*2 + 2*3 + 3*4 .... + 99*100

import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int n = sc.nextInt();
    sc.close();
    int res = patternSum(n);
    System.err.println(res);
  }

  static int patternSum(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
      sum = sum + i * (i + 1);
    }
    return sum;
  }
}

