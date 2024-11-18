
import java.util.Scanner;

public class Q25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();
    int res = 0;
    while (num > 9) {
      res = addDigit(num);
      num = res;
    }
    System.out.println(res);
    sc.close();
  }

  static int addDigit(int num) {
    int sum = 0;
    while (num > 0) {
      int rem = num % 10;
      sum = sum + rem;
      num = num / 10;
    }
    return sum;
  }
}

//leetcode: 233 400 1291
