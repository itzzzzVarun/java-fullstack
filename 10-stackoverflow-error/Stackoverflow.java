public class Stackoverflow {
  static int count = 0;

  public static void main(String[] args) {
    demo();
    System.out.println(count);
  }

  public static void demo() {
    count++;
    System.err.println("This is demo method.");
    demo();
  }
}
