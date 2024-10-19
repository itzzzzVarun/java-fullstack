import java.util.*;

public class A9 {

  public static int add(int a, int b) {
    return a+b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    int sum = add(a, b);
    System.out.println("Sum is " + sum);
    sc.close();
  }
}
