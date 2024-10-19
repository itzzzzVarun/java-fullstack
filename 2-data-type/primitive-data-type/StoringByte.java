
public class StoringByte {
  public static void main(String[] args) {

    // As byte range is from -128 to 127, it is overflowing
    byte a = (byte)(127 + 1);
    System.out.println(a);
  }
}
