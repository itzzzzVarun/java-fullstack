
import java.util.Scanner;

public class A16 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    System.out.println(productOddEven(num));
    sc.close();
  }

  static String productOddEven(int num) {
    while (num > 0) {
      int rem = num % 10;
      if (rem % 2 == 0 && rem != 0) {
        return "Product of each digit is even";
      }
      num = num / 10;
    }
    return "Product of each digit is odd";
  }
}