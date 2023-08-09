import java.util.Arrays;
import java.util.Stack;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be
 * constructed by using the letters from magazine and false otherwise.
 * 
 * Each letter in magazine can only be used once in ransomNote.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * 
 * Example 2:
 * 
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * 
 * Example 3:
 * 
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class solution383 {
    public boolean canConstruct(String r, String m) {
        if(m.length()<r.length())return false;

        Stack<Character> ransom = new Stack<>();
        Stack<Character> magazine = new Stack<>();

        char[] ra = new char[r.length()];
        char[] ma = new char[m.length()];

        for(int i =0; i <r.length();i++){
            ra[i] = r.charAt(i);
        }

        for(int j =0; j <m.length();j++){
            ma[j] = m.charAt(j);
        }

        Arrays.sort(ra);
        Arrays.sort(ma);

        for(int i =0; i <ra.length;i++){
            ransom.push(ra[i]);
        }

        for(int j =0; j <ma.length;j++){
            magazine.push(ma[j]);
        }

        while(!ransom.isEmpty()&& !magazine.isEmpty()){
            if(ransom.peek()== magazine.pop()){
                ransom.pop();
            }
        }
        if(ransom.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
