public class NonStaticMethod {
  public static void main(String[] args) {
    System.out.println("Program starts");
    // static method can be call by using class name as reference or directly.
    NonStaticMethod.start();

    // object creation
    NonStaticMethod n1 = new NonStaticMethod();

    // non-static method is called by using object reference.
    n1.drive();
    System.out.println("Program ends");
  }

  public static void start() {
    System.out.println("This is start method (static)");
  }

  public void drive() {
    System.out.println("This is drive method (non-static)");
  }
}

class Car {
  public static void main(String[] args) {
    System.out.println("Car class starts");
    NonStaticMethod.start();
    NonStaticMethod n1 = new NonStaticMethod();
    n1.drive();
    NonStaticMethod.main(null);
    System.out.println("Car class ends");
  }
}
