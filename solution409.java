import java.util.HashMap;

/**
 * Given a string s which consists of lowercase or uppercase letters, return the
 * length of the longest palindrome that can be built with those letters.
 * 
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome
 * here.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation: One longest palindrome that can be built is "dccaccd", whose
 * length is 7.
 * 
 * Example 2:
 * 
 * Input: s = "a"
 * Output: 1
 * Explanation: The longest palindrome that can be built is "a", whose length is
 * 1.
 */
public class solution409 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int length = 0;
        int odd = 0;
        for (int v : map.values()) {
            if (v % 2 == 0) {
                length += v;
            } else {
                // see odd as an even number + 1 : ccc-> cc + c, a-> _ _ + a
                length += v - 1;
                odd++;
            }
        }

        if (odd > 0) {
            length = length + 1;
        }
        return length;

    }
}
