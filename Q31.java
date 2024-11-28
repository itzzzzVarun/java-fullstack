//Alternate prime number

import java.util.Scanner;

public class Q31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a low...");
    int low = sc.nextInt();
    System.out.println("Enter high...");
    int high = sc.nextInt();
    sc.close();
    int count = 0;
    for (int i = low; i <= high; i++) {
      if (isPrime(i)) {
        count++;
        if (count % 2 == 0) {
          System.out.println(i + " ");
        }
      }
    }
  }

  static boolean isPrime(int num) {
    for (int i = 2; i <= Math.sqrt((double) num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
