// Question: By using random() method of Math class generate 2) Any 4 digit otp.

public class A5 {
  public static void main(String[] args) {
    System.out.println(Math.round((Math.random() * 10000)));
  }
}