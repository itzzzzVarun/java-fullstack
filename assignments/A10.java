class A10 {
  public static void main(String[] args) {
    int x = 30;
    System.out.println("This is x at the top of the main method " + x);
    {
      int a = 40;
      System.out.println("This is a " + a);
      System.out.println("This is x inside a's block " + x);
    }
    System.out.println("This is x in between a's block and b's block " + x);
    // System.out.println(a); compilation error
    {
      int b = 50;
      System.out.println("This is b " + b);
      System.out.println("This is x inside b's block " + x);
    }
    System.out.println("This is x at the bottom of the main method " + x);
    // System.out.println(b); compilation error
  }
}