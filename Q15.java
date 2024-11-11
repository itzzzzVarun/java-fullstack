import java.util.Scanner;

public class Q15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int n = sc.nextInt();
    sc.close();
    fib(n);
  }

  static void fib(int n) {
    int sum = 0;
    int zero = 0;
    int one = 1;
    System.out.println(zero);
    System.out.println(one);
    for (int i = 2; i <= n; i++) {
      sum = sum + zero + one;
      System.out.println(sum);
    }
  }
}
