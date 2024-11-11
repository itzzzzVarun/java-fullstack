// design a no-argument method to print the sum of 100 natural numbers which are divisible by 8 and alow ends with 8

public class A14 {
  public static void main(String[] args) {
    int res = getSum();
    System.out.println(res);
  }

  static int getSum() {
    int sum = 0;
    for (int i = 0; i <= 100; i++) {
      if (i % 8 == 0 && i % 10 == 8) {
        sum = sum + i;
      }
    }
    return sum;
  }
}
