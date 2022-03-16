//Given a string S, remove consecutive duplicates from it recursively.
package RecursionProblems;

public class RemoveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        if(s.length()<=1)
            return s;

        if(s.charAt(0)==s.charAt(1))
        {
            return removeConsecutiveDuplicates(s.substring(1));
        }
        else
            return s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));
    }
}
