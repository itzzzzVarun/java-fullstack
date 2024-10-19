import java.util.*;

class A7 {
  public static int big(int a, int b) {
    return Math.max(a, b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a = sc.nextInt();
    System.out.println("Enter the second number:");
    int b = sc.nextInt();
    int max = big(a, b);
    System.out.println("The biggest number is " + max);
    sc.close();
  }
}