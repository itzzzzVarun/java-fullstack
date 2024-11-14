// 14. Write a java program to print weather the number is perfect number or not.
//     perfect no:-sum of factors of the number should be equal to the number.

import java.util.Scanner;;

public class Q14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check if it is a perfect number or not...");
    int n = sc.nextInt();
    sc.close();
    boolean res = perfectNumber(n);
    if (res) {
      System.out.println(n + " is a perfect number. ");
    } else {
      System.out.println(n + " is not a perfect number. ");
    }
  }

  static boolean perfectNumber(int n) {
    int factorsSum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        factorsSum = factorsSum + i;
      }
    }

    if (factorsSum == n) {
      return true;
    } else {
      return false;
    }
  }
}
