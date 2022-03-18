/*
Write a recursive function to convert a given string into the number it represents.
 That is input will be a numeric string that contains only numbers,
 you need to convert the string into corresponding integer and return the answer.
 */

package RecursionProblems;

public class StringToInteger {
    public static int convertStringToInt(String input){
        // Write your code here
        if(input.length()<1)
            return 0;
        return ((input.charAt(0)-'0')*(int)Math.pow(10,input.length()-1))+convertStringToInt(input.substring(1));
    }
}
