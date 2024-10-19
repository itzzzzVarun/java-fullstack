
public class NonStaticVariable {
  // x is non-static variable
  int x = 30;

  public static void main(String[] args) {
    // Object creation
    NonStaticVariable ns = new NonStaticVariable();
    System.out.println(ns.x);
  }
}

class Test {
  public static void main(String[] args) {
    NonStaticVariable ns = new NonStaticVariable();
    System.out.println(ns.x);
  }
}
