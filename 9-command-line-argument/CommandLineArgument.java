class CommandLineArgument {
  public static void main(String[] args) {
    System.out.println("Program starts");
    System.out.println("This is main mehtod");
    System.out.println("Length of agrs is " + args.length);

    // We will send these values of args from command line at run time. And in this
    // case,
    // to avoid exception have to provide atleast two values from command line.
    System.out.println("First element of args is " + args[0]);
    System.out.println("First element of args is " + args[1]);
    System.out.println("Program ends.");
  }
}