public class Solution {
  public static int century(int number) {
    // your code goes here
    if (number % 100 == 0) {
      number = number / 100;
    } else {
      number = (number / 100) + 1;
    }
    return number;
  }
}