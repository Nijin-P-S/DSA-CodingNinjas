//Program to replace 'pi' from a string and replace it with 3.14

package RecursionProblems;

public class ReplacePi {

    public static String replace(String input){
        if(input.length()<=1)
            return input;

        if(input.charAt(0)=='p' && input.charAt(1)=='i')
            return "3.14"+replace(input.substring(2));
        else
            return input.charAt(0)+replace(input.substring(1));
    }

    public static void main(String[] args) {
//        Dry Run test
        System.out.println(replace("pirtebibdihipinbjkdspi"));
    }
}
