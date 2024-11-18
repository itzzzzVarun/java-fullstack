// Count number on 1s till nth number. e.g 1,2,3,4,5,6,7,8,9,10 = 2 ones first 1 and second 1 in 10.

import java.util.Scanner;

public class Q27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int n = sc.nextInt();
    int res = countDigitOne(n);
    System.out.println(res);
    sc.close();
  }

  static int countDigitOne(int n) {
    if (n <= 0)
      return 0;
    int q = n, ans = 0, fact = 1;

    do {
      int rem = q % 10;
      q = q / 10;
      ans = ans + q * fact;
      if (rem == 1) {
        ans = ans + n % fact + 1;
      }
      if (rem > 1) {
        ans = ans + fact;
      }
      fact = fact * 10;
    } while (q > 0);
    return ans;
  }
}
