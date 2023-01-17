import java.util.ArrayList;
import java.util.Stack;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If
 * reversing x causes the value to go outside the signed 32-bit integer range
 * [-231, 231 - 1], then return 0.
 * 
 * Assume the environment does not allow you to store 64-bit integers (signed or
 * unsigned).
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: x = 123
 * Output: 321
 * 
 * Example 2:
 * 
 * Input: x = -123
 * Output: -321
 * 
 * Example 3:
 * 
 * Input: x = 120
 * Output: 21
 */
public class solution7 {
    public int reverse(int x) {
        //note that if x is positive or negative
        int flag = x<0? -1:1;
        x= x*flag;

        ArrayList<Integer> arr = new ArrayList<>();
        int count =0;

        while(x>0){    
            arr.add(x%10);
            count++;
            x/=10;
        }

        int result=0;
        int j=0;
        for(int i=count-1;i>=0;i--){
            //in order to deal with the overflow
            if(result > Integer.MAX_VALUE-(Math.pow(10,i)*arr.get(j)))return 0;
            result+= (Math.pow(10,i)*arr.get(j));
            
            j++;
        }
        result = flag*result;
        
        return result;
    }
}
