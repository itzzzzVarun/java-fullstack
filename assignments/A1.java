//Question-1 -> Design a method which will accept a number and will return last degit of the number

public class A1 {
  public static void main(String[] args) {
    System.out.println("Program starts");

    int input = 23;
    int output = test(input);
    System.out.println("The last digit of "+input+" is "+output);
    
    System.out.println("Program ends");
  }

  public static int test(int x) {
    return x%10;
  }
}
