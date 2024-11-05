public class Method {
  public static void test() {
    System.out.println("This is test method");
    System.out.println("test method ends");
  }

  public static void main(String[] args) {
    System.out.println("Program starts");
    System.out.println("This is Main method");
    demo();
    System.out.println("Program ends.");
  }

  public static void demo() {
    System.out.println("This is demo method");
    test();
    System.out.println("Demo method ends");
  }
}
