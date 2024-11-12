//Print the factorial upto n terms.

import java.util.Scanner;

class A15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      fact(i);
    }
    sc.close();
  }

  static void fact(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.println(n + "!= " + fact);
  }
}