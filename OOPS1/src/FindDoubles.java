import java.util.HashMap;

public class FindDoubles {

    public static void findDoubles(String s){

        //Created a hashmap to store the characters of the string
        HashMap<Character, Integer> hashMap = new HashMap<>();

        //Looped through the string and initialized the hashmap with the required keys(character in string) and values
        for(int i=0;i<s.length();i++){
            if(hashMap.get(s.charAt(i))==null)
                hashMap.put(s.charAt(i),1);
            else
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
        }

        //Looped through the string and checked the hashmap whether the character is present twice in string or not
        //If yes print the character also reduce the value of key by 1 , or else it will print twice in output.
        for(int i=0;i<s.length();i++){
            if(hashMap.get(s.charAt(i))==2){
                System.out.println(s.charAt(i));
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))-1);
            }
        }

    }

    public static void main(String[] args) {
        String s = "goodMorning";
        findDoubles(s);
    }
}
