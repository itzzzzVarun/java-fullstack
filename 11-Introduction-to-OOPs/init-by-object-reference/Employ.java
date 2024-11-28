class Employ {
      String name;
      int id;
      double salary;

      public void getDetails() {
            System.out.println("Name is " + name);
            System.out.println("Id is " + id);
            System.out.println("Salary is " + salary);
      }
}

class EmployDriver {
      public static void main(String[] args) {
            Employ e1 = new Employ();
            e1.name = "Mohan";
            e1.id = 0123;
            e1.salary = 1234.5;
            e1.getDetails();
      }
}
