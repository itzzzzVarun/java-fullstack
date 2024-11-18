
//strong number: If the number is equals to the sum of the factorial of its each digits in called strong number.
import java.util.Scanner;

public class Q23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();
    int res = factSum(num);
    if (res == num) {
      System.out.println(num + " is a strong number");
    } else {
      System.out.println(num + " is not a strong number");
    }
    sc.close();
  }

  static int factSum(int num) {
    int sum = 0;
    while (num > 0) {
      int rem = num % 10;
      int fact = fact(rem);
      sum = sum + fact;
      num = num / 10;
    }
    return sum;
  }

  static int fact(int num) {
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact = fact * i;
    }
    return fact;
  }
}
