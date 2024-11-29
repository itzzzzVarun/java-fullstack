public class Employ {
  static int count = 0;

  Employ() {
    count++;
    System.out.println("Car " + count + " object is created");
  }
}

class EmployDriver {
  public static void main(String[] args) {
    System.out.println("Main start");
    Employ e1 = new Employ();
    Employ e2 = new Employ();
    Employ e3 = new Employ();
    System.out.println("Main end");

  }
}
