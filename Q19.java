
// count the number of digits in given number
import java.util.Scanner;

public class Q19 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();
    int count = count(num);
    System.out.println(count + " number of digits in the " + num);
    sc.close();
  }

  static int count(int num) {
    int count = 0;
    while (num > 0) {
      count++;
      num = num / 10;
    }
    return count;
  }
}