
// Sum of 100 natural numbers
import java.util.Scanner;

public class A13 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = sum100NaturalNumbers(n);
    System.out.println(res);
    sc.close();
  }

  public static int sum100NaturalNumbers(int n) {
    return (n * (n + 1)) / 2;
  }
}