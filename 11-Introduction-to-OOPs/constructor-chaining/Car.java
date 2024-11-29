
public class Car {
  String name;
  int price;
  String color;

  Car() {
    System.out.println("car object is created");
  }

  Car(String name) {
    this();
    this.name = name;
  }

  Car(String name, int price) {
    this(name);
    this.price = price;
  }

  Car(String name, String color) {
    this(name);
    this.color = color;
  }

  Car(String name, int price, String color) {
    this(name, color);
    this.price = price;
  }

  public void getDetails() {
    System.out.println("Name is " + this.name);
    System.out.println("Price is " + this.price);
    System.out.println("Color is " + color);
    System.out.println("====================");
  }
}

class CarDriver {
  public static void main(String[] args) {
    Car c1 = new Car("tata punch");
    Car c2 = new Car("Tata Curv", "Black");
    Car c3 = new Car("Tata Naxon", 7654);
    Car c4 = new Car("MG-Hector", 9876, "white");
    c1.getDetails();
    c2.getDetails();
    c3.getDetails();
    c4.getDetails();
  }
}
