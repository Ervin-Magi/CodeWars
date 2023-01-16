public class Dinglemouse {
  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    // Your code here!
    int catYears = 15;
    int dogYears = 15;
    if (humanYears >= 2) {
      catYears += 9;
      dogYears += 9;
      if (humanYears >= 3) {
        for (int i = 2; i < humanYears; ++i) {
          catYears += 4;
          dogYears += 5;
        }
      }
    }
    return new int[] {humanYears,catYears,dogYears};
  }
}