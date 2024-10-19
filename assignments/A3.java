// Question-3 -> Design a method which will accept two numbers and will return the bigger number.

public class A3 {
  public static void main(String[] args) {
    System.out.println("Program starts");

    int input_1 = 5;
    int input_2 = 10;
    int output = test(input_1, input_2);
    System.out.println("The bigger number is " + output);

    System.out.println("Program starts");
  }

  public static int test(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }
}
