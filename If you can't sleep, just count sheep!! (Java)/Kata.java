class Kata {
  public static String countingSheep(int num) {
    //Add your code here
    String result ="";
      for(int i=0; i != num; i++){
        result = result+(i+1)+" sheep...";
      }
    return result;
  }
}