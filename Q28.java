
//do-while loop:- Is an exit control loop where loop body execute first and then condition is checked at exit point.
import java.util.Scanner;

public class Q28 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean desire = true;
    do {
      System.out.println("Enter a number...");
      int num = sc.nextInt();
      int res = fact(num);
      System.out.println(num + " != " + res);
      System.out.println("Press y to continue and anything else to discontinue...");
      char want = sc.next().charAt(0);
      if (want == 'y' || want == 'Y') {
        desire = true;
      } else {
        desire = false;
        System.out.println("============Program ends==========");
      }
    } while (desire);
    sc.close();
  }

  static int fact(int num) {
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }
    return fact;
  }
}

// Implement do-while for power, prime no., perfact no, sum of digit program and
// palindrom number programs