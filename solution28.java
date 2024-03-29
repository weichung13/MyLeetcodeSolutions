/**
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * 
 * Example 2:
 * 
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 * 
 * Solved with sliding window
 */
public class solution28 {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        
        //i<= h-n : in case of h = n
        for(int i =0 ;i <= h-n ;i++){
            if(haystack.substring(i,n+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
