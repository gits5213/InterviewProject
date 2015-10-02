/*
http://www.javacodex.com/Collections/Finding-The-Longest-String-In-A-String-Array
Java Examples

for Python
https://gist.github.com/kmandreza/4441292
*/


public class LongestString {
 
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
    String[] strings = {"Big Bird", "Fish","Small","A very long string","Foo"};
    String longestString = getLongestString(strings);
 
    for (int i=0; i<strings.length; i++) {
      System.out.println(strings[i]);
    }
 
    System.out.println("Longest string: " + longestString);
  }
}