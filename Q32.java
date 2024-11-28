import java.util.Scanner;;

public class Q32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();

    if (isDisarium(num)) {
      System.out.println("It is a disarium numbre.");
    } else {
      System.out.println("It is not a disarium numbre.");
    }
    sc.close();
  }

  static int count(int num) {
    int count = 0;
    while (num > 0) {
      num /= 10;
      count++;
    }
    return count;
  }

  static boolean isDisarium(int num) {
    int originalNum = num;
    int count = count(num);
    int sum = 0;
    while (num > 0) {
      int rem = num % 10;
      sum += Math.pow((double) rem, (double) count);
      count--;
      num /= 10;
    }
    return originalNum == (int) sum;
  }
}
