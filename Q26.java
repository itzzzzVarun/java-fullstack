//An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

//Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Q26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the low value...");
    int low = sc.nextInt();
    System.out.println("Enter the high value...");
    int high = sc.nextInt();
    List<Integer> res = sequentialDigits(low, high);
    res.forEach(value -> System.out.print(value + " "));
    sc.close();
  }

  public static List<Integer> sequentialDigits(int low, int high) {
    String s = "123456789";
    List<Integer> res = new ArrayList();

    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i));
      for (int j = i + 1; j < s.length(); j++) {
        System.out.println(s.charAt(j));
        int num = Integer.parseInt(s.substring(i, j + 1));

        if (num > high)
          break;
        if (low <= num)
          res.add(num);
      }
    }
    res.sort(null);
    return res;
  }
}
