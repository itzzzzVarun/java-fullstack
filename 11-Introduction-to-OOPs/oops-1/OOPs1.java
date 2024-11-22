class OOPs1 {
  public static void main(String[] args) {
    Employ e1 = new Employ();
    Employ e2 = new Employ();
    e1.name = "Varun Singh";
    e1.id = 9009;
    e1.salary = 100000;
    e2.name = "Arpit Yadav";
    e2.id = 1001;
    e2.salary = 500000;
    System.out.println("===Employ one details===");
    System.out.println("Employ name is " + e1.name);
    System.out.println("Employ id is " + e1.id);
    System.out.println("Employ salary is " + e1.salary);
    System.out.println("Employ company name is " + Employ.company);
    e1.work();
    System.out.println("===end of employ one details===");
    System.out.println("===Employ two details===");
    System.out.println("Employ name is " + e2.name);
    System.out.println("Employ id is " + e2.id);
    System.out.println("Employ salary is " + e2.salary);
    System.out.println("Employ company name is " + Employ.company);
    e2.work();
    System.out.println("===end of employ one details===");

  }

}

class Employ {
  static String company = "Qspider";
  String name;
  int id;
  double salary;

  public void work() {
    System.out.println("Employ is working");
  }
}