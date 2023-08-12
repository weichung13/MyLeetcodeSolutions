import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
 * may assume that the majority element always exists in the array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * 
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 * 
 */
public class solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
    
        int result = 0;
        for(int i=0;i<nums.length;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
           if(map.get(nums[i])>nums.length/2){
               result = nums[i];
            }
        }
       return result;
    }
}
