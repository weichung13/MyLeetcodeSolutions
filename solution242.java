import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * 
 * Example 2:
 * 
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class solution242 {
    public boolean isAnagram(String s, String t) {
        char [] schar = s.toCharArray();
        char [] tchar = t.toCharArray();
        
        Arrays.sort(schar);
        Arrays.sort(tchar);
        
        String s1 = new String(schar);
        String s2 = new String(tchar);
        
        return s1.equals(s2);
    }
}
