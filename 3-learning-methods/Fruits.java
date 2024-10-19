class Fruits {
  public static void main(String[] args) {
    // We can call a static method by using class reference
    Fruits.test();
    // We can not call a non static method by just using class reference
    // Fruits.demo() This is wrong because demo() is not static

    // To call a non static method we can to create object of Fruits class the to
    // call not static method we have to use object reference

    Fruits f = new Fruits(); // Creating object of Fruits class
    f.demo(); // //using object reference to call demo() a non static method
  }

  // This is a static method
  static void test() {
    System.out.println("This is test and it is a static method.");

  }

  // This is not a static method
  void demo() {
    System.out.println("This is demo and this is a not static method.");
  }
}