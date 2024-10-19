class Unicode {
  public static void main(String[] args) {
    System.out.println('\u0001');
    System.out.println('\u0002');
    System.out.println('\u0003');
    System.out.println('\u0004');
    System.out.println('\u0046');
    System.out.println('\u0065');
    System.out.println('\u003d');
    System.out.println('\u003a');
    System.out.println('\u00bc');
    System.out.println('\u221e');

    // ASCII values
    System.out.println('@' + 10); // 74
    System.out.println('@' > 50); // true
    System.out.println('A' > 'a'); // false
    System.out.println('d' > 'D'); // true
    System.out.println('A' + 'd'); // 165
    System.out.println('B' + 'd' + 10); // 176
    System.out.println('2' - 48); // 2
    System.out.println('8' + 10 - 48); // 18
    System.out.println('8' - '0' + 10); // 18
    System.out.println((char) 100); // 'd'
    System.out.println((int) 'd'); // 100
    System.out.println((char) 256); // ? unknown
  }
}