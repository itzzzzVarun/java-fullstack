
public class This {
  public void thisKeyword() {
    System.out.println(this);
  }
}

class ThisDriver {
  public static void main(String[] args) {
    This t1 = new This();
    This t2 = new This();
    This t3 = new This();
    System.out.println("Main start");
    System.out.println(t1);
    t1.thisKeyword();
    System.out.println("==========");

    System.out.println(t2);
    t2.thisKeyword();
    System.out.println("==========");

    System.out.println(t3);
    t3.thisKeyword();
    System.out.println("==========");
    System.out.println("Main ends");
  }
}
