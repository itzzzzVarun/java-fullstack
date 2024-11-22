
import java.util.Scanner;

public class Q30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();
    if (isArmstrong(num)) {
      System.out.println(num + " is a Armstrong number.");
    } else {
      System.out.println(num + " is not a Armstrong number");
    }
    sc.close();
  }

  public static boolean isArmstrong(int num) {
    int input = num;
    int noOfDigits = getDigit(num);
    int sum = 0;
    while (num > 0) {
      int rem = num % 10;
      sum = sum + getPower(rem, noOfDigits);
      num = num / 10;
    }
    return (sum == input);
  }

  public static int getPower(int a, int b) {
    int pow = 1;
    for (int i = 1; i <= b; i++) {
      pow = pow * a;
    }
    return pow;
  }

  public static int getDigit(int num) {
    int count = 0;
    while (num > 0) {
      count++;
      num = num / 10;
    }
    return count;
  }
}
