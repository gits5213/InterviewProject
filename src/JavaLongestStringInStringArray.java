


//Write a method that takes an Array of Strings as an input and print the longest string. Write down 
//a list of test cases that you would write to test the method. Rework as needed. 
//For example: ['cat', 'dog', 'elephant'] passed in, expected 'elephant' to be printed to console.


public class JavaLongestStringInStringArray {
 
  public static String getLongestString(String[] array) {
      int maxLength = 0;
      String longestString = null;
      for (String s : array) {
          if (s.length() > maxLength) {
              maxLength = s.length();
              longestString = s;
          }
      }
      return longestString;
  }
 
  public static void main(String[] args) {
      String[] toppings = {"Cat", "Dog", "Elephant"};
      String longestString = getLongestString(toppings);
      System.out.format("longest string: '%s'\n", longestString);
      System.out.format("longest string: '%s'\n", longestString);
  }
  
 
}
