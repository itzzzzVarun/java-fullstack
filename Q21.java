//Product of all digit other than 0


import java.util.Scanner;
public class Q21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number...");
    int num = sc.nextInt();
    int product = productOfallDigits(num);
    System.out.println("Product of all digits of "+num+ " is "+product);
    sc.close();

  }

  static int productOfallDigits(int num ) {
    int product = 1;
    while (num > 0) {
      int rem = num % 10;
      product = product * rem;
      num = num / 10;
    }

    return product;
  }
}
