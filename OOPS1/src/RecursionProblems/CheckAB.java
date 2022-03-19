/*
Suppose you have a string, S, made up of only 'a's and 'b's.
Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.
 */

package RecursionProblems;

public class CheckAB {
    public static boolean checkAB(String input) {
        // Write your code here
        if(input.length()<1)
            return true;

        if(input.charAt(0)=='a' ){
            if(input.length()>=3 && (input.charAt(1)=='b' && input.charAt(2)=='b'))
                return checkAB(input.substring(3));
            else
                return checkAB(input.substring(1));
        }
        return false;
    }
}
