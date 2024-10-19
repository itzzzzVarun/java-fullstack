// Question: By using random() method of Math class generate 3) Any 6 digit otp. 

public class A6 {
  public static void main(String[] args) {
    System.out.println(Math.round((Math.random() * 1000000)));
  }
}