//for loop: for loop is entry control loop which check condition first and then loop body executes. 
//for (initialization; condition; increment/decrement) {  body  }

//break keyword: break is a keyword which is used inside loop or switch case to terminate the execution of loop or switch block. When JVM reads break keyword then immidiately JVM will come out of the block of loop or switch.

//continue keyword: continue is a keyword which is used to skip one or more exxcutions from the loop. When JVM reads continue keyword then immidiately it is transfered to increament or decreament of the loop. 
//Question: Deisgn a method which will accept tree integer numbers and will provide LCM of 3 numbers. And design another method which take 3 number as input and provide gcd of three number as output.

import java.util.Scanner;

public class Q29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number...");
    int a = sc.nextInt();
    System.out.println("Enter second number...");
    int b = sc.nextInt();
    System.out.println("Enter third number...");
    int c = sc.nextInt();
    int lcm = lcmOfThree(a, b, c);
    System.out.println("LCM is " + lcm);
    int gcd = gcdOfThree(a, b, c);
    System.out.println("GCD is " + gcd);
    sc.close();
  }

  static int lcmOfThree(int a, int b, int c) {
    int big = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    int i = big;
    while (i % a != 0 || i % b != 0 || i % c != 0) {
      i += big;
    }
    return i;
  }

  static int gcdOfThree(int a, int b, int c) {
    int small = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
    int i = small;
    while (a % i != 0 || b % i != 0 || c % i != 0) {
      i--;
    }
    return i;
  }

  static int LCM(int a, int b) {
    int gcd = GCD(a, b);
    return (a * b) / gcd;
  }

  static int GCD(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
