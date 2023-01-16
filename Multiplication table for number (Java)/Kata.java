class Kata {
    public static String multiTable(int num) {
    String result ="";
      for (int number = 1; number <= 10; number++) {
        int y = num * number;
        if (number < 10) {
          result += number + " * " + num + " = " + y + "\n";
        } else {
          result += number + " * " + num + " = " + y;
        }
      }
      return result;
    }
}