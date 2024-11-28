class Employ {
  String name;
  int id;
  double salary;

  public void setValue(String name, int id, double salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

  public void getDetails() {
    System.out.println("Name is " + this.name);
    System.out.println("Id is " + this.id);
    System.out.println("salary is " + this.salary);
  }
}

class EmployDriver {
  public static void main(String[] args) {
    Employ e1 = new Employ();
    Employ e2 = new Employ();

    e1.name = "Mohan";
    e2.name = "Sohan";
    e1.setValue("Mohan", 128, 34567.8);
    e2.setValue("Sohan", 223, 45032.8);
    e1.getDetails();
    e2.getDetails();
  }
}