public class FunctionWithReturn {
  public static void main(String[] args) {
    System.out.println("Program starts");

    // We are receiving the returned value of method test in variable x (x must be
    // of int type because it is going to store integer value)
    int p = 5;
    int x = test(p);
    System.out.println("Square of " + p + " is " + x);

    System.out.println("Program ends");

  }

  // test() is a method which return integer value as its return type is int.
  public static int test(int x) {
    int sq = x * x;

    // here we are returning square of x
    return sq;
  }
}
