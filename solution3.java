import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
 * Example 1:
 * 
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * 
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * 
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a
 * substring.
 */

/*
 * Hashmap:
 * Create a hashmap to store the letters and its index
 * If there's a duplicate letter clear the map and store the current length of substring to the max.
 */

 /*
  * Time complexity:O(n)
  */
public class solution3{
    public int lengthOfLongestSubstring(String s){
        if (s == null || s.length() <= 1) {
            return s.length();
        }

        Map<Character,Integer>map = new HashMap<>();
        int max = 0;
        int count =0;
        for(int i =0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                //put "i" because we have to store the index on order to  keep counting from the letter that occurs duplicate
                map.put(s.charAt(i),i);
                count++;
            }else{
                i = map.get(s.charAt(i));
                map.clear();
                max = Math.max(max,count);
                count =0;
            }

        }
        max = Math.max(max,count);
        return max;
    }
}