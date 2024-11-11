// 7. 1/2 + 1/2 + 1/3 + 1/4 +......+ 1/100

import java.util.Scanner;

public class Q7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int n = sc.nextInt();
    sc.close();
    double res = sumDivide(n);
    System.out.println(res);
  }

  static double sumDivide(int n) {
    double sum = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum + (1.0 / i);
    }
    return sum;
  }
}
