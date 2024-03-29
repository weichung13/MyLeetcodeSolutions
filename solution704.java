/**
 * Given an array of integers nums which is sorted in ascending order, and an
 * integer target, write a function to search target in nums. If target exists,
 * then return its index. Otherwise, return -1.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * Explanation: 9 exists in nums and its index is 4
 * 
 * Example 2:
 * 
 * Input: nums = [-1,0,3,5,9,12], target = 2
 * Output: -1
 * Explanation: 2 does not exist in nums so return -1
 */
public class solution704 {
    public int search(int[] nums, int target) {

        int right = nums.length-1;
        int left = 0;

        int index = -1;

        while(left<=right){
            int mid = right-left/2;
            
            if(target == nums[mid]){
                index = mid;
            }

            if(target > nums[mid]){
                left = mid +1;
            }else{
                right = mid-1;
            }
            
        }
        return index;
    }
}
