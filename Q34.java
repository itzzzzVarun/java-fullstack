
import java.util.Scanner;

public class Q34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();
    sc.close();
    if (isFascinatingArr(num)) {
      System.out.println(num + " is a fascinating number");
    } else {
      System.out.println(num + " is not a fascinating number");
    }

    if (isFascinating(num)) {
      System.out.println(num + " is a fascinating number");
    } else {
      System.out.println(num + " is not a fascinating number");
    }
  }

  static boolean isFascinating(int num) {
    String str = num + "" + num * 2 + "" + num * 3;
    if (num < 100) {
      return false;
    }
    if (str.length() != 9) {
      return false;
    }
    for (char i = '1'; i <= '9'; i++) {
      int count = 0;
      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == i) {
          count++;
        }
      }
      if (count != 1) {
        return false;
      }
    }
    return true;
  }

  static boolean isFascinatingArr(int num) {
    String str = num + "" + num * 2 + "" + num * 3;
    int[] freq = new int[9];
    if (str.length() != 9) {
      return false;
    }

    if (num < 100) {
      return false;
    }

    for (int i = 0; i < str.length(); i++) {
      freq[str.charAt(i) - 49]++;
    }
    for (int i = 0; i < freq.length; i++) {
      if (freq[i] != 1) {
        break;
      }
    }
    return true;
  }
}
