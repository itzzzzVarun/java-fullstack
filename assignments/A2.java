//Question-2 -> Design a function which will accept a number and will return square of last digit of number.

public class A2 {
  public static void main(String[] args) {
    System.out.println("Program starts");

    int input = 23;
    int output = test(input);
    System.out.println("Square of last digin of " + input + " is " + output);
    System.out.println("Program starts");
  }

  public static int test(int x) {
    int ld = x % 10;

    return ld * ld;
  }
}
