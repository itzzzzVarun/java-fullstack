//Happy number
import java.util.Scanner;

class Q33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();
    sc.close();
    if (ifHappy(num)) {
      System.out.println(num + " is a happy number");
    } else {
      System.out.println(num + " is not a happy number");
    }
  }

  static boolean ifHappy(int num) {
    if (num == 1)
      return true;
    if (num == 7)
      return true;
    while (num > 9) {
      int sum = 0;
      while (num > 0) {
        int rem = num % 10;
        sum += rem * rem;
        num /= 10;
      }
      num = sum;
    }
    return num == 1 || num == 7;
  }
}