import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * Example 2:
 * 
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 */
public class solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return strs[0];

        /*
         * Sort the array and there will be the least common prefix between the first and the last index of string array.
         * Then compare the first and the last string.
         */
        Arrays.sort(strs);
        String right = strs[0];
        String left = strs[strs.length-1];
        StringBuilder str = new StringBuilder();
        for(int i=0;i<right.length();i++){
            if(right.charAt(i)==left.charAt(i)){
                str.append(right.charAt(i));
            }else{
                break;
            }
        }
        return str.toString();
    }
}
