/*
Check whether a given String S is a palindrome using recursion. Return true or false.
 */

package RecursionProblems;

public class PalindromeCheck {
    public static boolean isStringPalindrome(String input) {
        // Write your code here
        if(input.length()<=1)
            return true;
        if(input.charAt(0)!=input.charAt(input.length()-1))
            return false;
        return true && isStringPalindrome(input.substring(1,input.length()-1));
    }
}
