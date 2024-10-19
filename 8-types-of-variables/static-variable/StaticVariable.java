
public class StaticVariable {

  // x is static variable
  static int x = 30;

  public static void main(String[] args) {
    System.out.println(x);
    System.out.println(StaticVariable.x);
  }
}

class Test {

  public static void main(String[] args) {
    System.out.println(StaticVariable.x);
  }
}
