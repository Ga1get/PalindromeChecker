import java.util.Scanner;
import java.lang.StringBuilder;
// import java.util.regex.Pattern;
class Main {
  public static String userInput = "";
  public static StringBuilder sb;
  public static String punctuation = "";
  public static String vPalindrome = "";
  public static boolean isPalindrome = false;
  public static String permInput = "";
  public static Scanner scr = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Please input the string word you would like to check for a palindrome:");
    userInput = scr.nextLine();
    permInput = userInput;
    userInput = userInput.toLowerCase();
    char loopCharacter = ' ';
    // sb.append(userInput);
    // sb = new StringBuilder(userInput);
    for (int i = 0; i < (userInput.length()); i++){
      // 97 - 122
      if(((int) userInput.charAt(i)) < 97 || ((int) userInput.charAt(i)) > 122 ){
       String localChar = "";
        localChar += userInput.charAt(i);
         userInput = userInput.replace(localChar,"");
        
        // userInput.charAt(i) = "";
        // localChar = "";
      }
    }
    // userInput = sb.toString();
    for (int i = (userInput.length() - 1); i > -1; i--){
      loopCharacter = userInput.charAt(i);
      
      vPalindrome += loopCharacter;
        
      
      
    }
    int nCorrect = 0;
    for (int i = 0; i < (userInput.length()); i++){
      if (userInput.charAt(i) == vPalindrome.charAt(i)){
        nCorrect ++;
      }
    }
    if(nCorrect == userInput.length()){
      isPalindrome = true;
    }
    if(isPalindrome){
      System.out.println(permInput + " is a palindrome");
      
    }
    else{
      System.out.println(permInput + " is not a palindrome");
      
    }
    // System.out.println(((int)'?') + "is ?");
    
  }
}