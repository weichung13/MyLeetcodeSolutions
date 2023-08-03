import java.util.Stack;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * 
 * Example 3:
 * 
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric
 * characters.
 * Since an empty string reads the same forward and backward, it is a
 * palindrome.
 * 
 * 
 * Create 2 stacks one push forward another push backward, if pop out is the same return true.
 */

public class solution125 {
    public boolean isPalindrome(String s) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i =0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))|| Character.isDigit(s.charAt(i))){
                stack1.push(Character.toLowerCase(s.charAt(i)));
            }
        }

        for(int j = s.length()-1; j>=0; j--){
            if(Character.isLetter(s.charAt(j))|| Character.isDigit(s.charAt(j))){
                stack2.push(Character.toLowerCase(s.charAt(j)));
            }
        }

        boolean isPalindrome = true;
        while(!stack1.isEmpty()&& !stack2.isEmpty()){
            if(stack1.pop()!=stack2.pop()){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
