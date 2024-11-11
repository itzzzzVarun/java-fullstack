import java.util.*;

public class Q12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int n = sc.nextInt();
    int res = fact(n);
    sc.close();
    System.out.println(res);
  }

  static int fact(int n) {
    int res = 1;
    for (int i = 1; i <= n; i++) {
      res = res * i;
    }
    return res;
  }
}
