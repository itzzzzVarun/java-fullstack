import java.util.Scanner;

public class Q22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();
    factorialOfAllDigit(num);
    sc.close();
  }

  static void factorialOfAllDigit(int num) {
    while (num > 0) {
      int rem = num % 10;
      System.out.println(rem +" != "+fact(rem));
      num = num / 10;
    }
  }

  static int fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }
}
