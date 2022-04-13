import java.util.Scanner;
class Main {
  public static String userInput = "";
  public static String vPalindrome = "";
  public static boolean isPalindrome = false;
  public static Scanner scr = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Please input the string word you would like to check for a palindrome:");
    userInput = scr.nextLine();
    userInput = userInput.toLowerCase();
    char loopCharacter = ' ';
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
      System.out.println(userInput + " is a palindrome");
      
    }
    else{
      System.out.println(userInput + " is not a palindrome");
      
    }
    // System.out.println(vPalindrome + " is the vPalindrome");
    
  }
}