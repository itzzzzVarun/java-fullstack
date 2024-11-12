//nth tern of fibonacci series.

import java.util.Scanner;

public class Q18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int n = sc.nextInt();
    sc.close();
    int res = fib(n);
    System.out.println(res);
  }

  static int fib(int n) {
    int zero = 0;
    int one = 1;
    int ans = 0;
    for (int i = 2; i <= n; i++) {
      ans = zero + one;
      zero = one;
      one = ans;
    }
    return ans;
  }
}
