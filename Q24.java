//check if number is palindrom or not.

import java.util.Scanner;

public class Q24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();
    int res = reverse(num);
    if (res == num) {
      System.out.println("It is a palindrom number.");
    } else {
      System.out.println("It is not a palindrom number.");
    }
    sc.close();
  }

  static int reverse(int num) {

    int newNum = 0;
    while (num > 0) {
      int rem = num % 10;
      newNum = newNum * 10 + rem;
      num = num / 10;
    }
    return newNum;
  }
}
