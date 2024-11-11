// 3. sum of cubes 100 natural numbers

import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int n = sc.nextInt();
    int sum = sumNnaturalNumbers(n);
    System.out.println(sum);
    sc.close();
  }

  static int sumNnaturalNumbers(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum = sum + i*i*i;
    }
    return sum;
  }
}
