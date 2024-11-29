
class Car {

  String name;
  int price;
  String color;

  Car(String name) {
    this.name = name;
  }

  Car(String name, int price) {
    this.name = name;
    this.price = price;
  }

  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

  Car(String name, int price, String color) {
    this.name = name;
    this.price = price;
    this.color = color;
  }

  public void getDetails() {
    System.err.println("name is " + this.name);
    System.err.println("price is " + this.price);
    System.err.println("color is " + this.color);
    System.out.println("====================");
  }
}

class CarDriver {
  public static void main(String[] args) {
    System.out.println("Hello");
    Car c1 = new Car("TATA Punch", 1234, "red");
    Car c2 = new Car("TATA Punch", 1234);
    Car c3 = new Car("TATA Punch", "red");
    Car c4 = new Car("TATA Punch");
    c1.getDetails();
    c2.getDetails();
    c3.getDetails();
    c4.getDetails();
  }
}
