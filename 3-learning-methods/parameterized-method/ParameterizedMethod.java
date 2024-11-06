class ParameterizedMethod {
  public static void main(String[] args) {
    int x = 5;
    System.out.println("Program starts");
    test(x);
    System.out.println("Program ends");
  }

  // Parameterized Methods are those method which accepts some arguments and will
  // perform some operation on those arguments.
  // eg : test is parameterized method
  public static void test(int x) {
    System.out.println("test method starts");
    System.out.println("The value of x is: " + x);
    System.out.println("test method ends");
  }
}