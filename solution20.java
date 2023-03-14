import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * 
 * Example 1:
 * 
 * Input: s = "()"
 * Output: true
 * 
 * Example 2:
 * 
 * Input: s = "()[]{}"   ([)]
 * Output: true
 * 
 * Example 3: 
 * 
 * Input: s = "(]"
 * Output: false
 */
public class solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '('|| ch == '['||ch == '{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty())return false;
                if(ch==')'&& stack.peek()=='('){
                    stack.pop();
                }else if(ch==']'&& stack.peek()=='['){
                    stack.pop();
                }else if(ch=='}'&& stack.peek()=='{'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }
        }
        return  stack.isEmpty();
    }
}