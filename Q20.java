
//Sum of all digits
import java.util.Scanner;

public class Q20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();
    int sum = sumOfAllDigits(num);
    System.out.println("The sum of all digits of " + num + " is " + sum);
    sc.close();
  }

  static int sumOfAllDigits(int num) {
    int sum = 0;
    while (num > 0) {
      int rem = num % 10;
      sum = sum + rem;
      num = num / 10;
    }
    return sum;
  }
}
