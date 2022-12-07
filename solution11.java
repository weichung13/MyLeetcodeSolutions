/**
 * You are given an integer array height of length n. There are n vertical lines
 * drawn such that the two endpoints of the ith line are (i, 0) and
 * (i,height[i]).
 * 
 * Find two lines that together with the x-axis form a container, such that the
 * container contains the most water.
 * 
 * Return the maximum amount of water a container can store.
 * 
 * Notice that you may not slant the container.
 * 
 * Example 1:
 * 
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array[1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 */

 /* 1.Brute Force Time complexity:O(n^2) 
public class solution11 {
    public int maxArea(int[] height) {
        int maxArea =0;
        for(int left=0;left<height.length;left++){
            for(int right=left+1;right<height.length;right++){
                maxArea = Math.max(maxArea,(right-left)*Math.min(height[left],height[right]));
            }
        }
        return maxArea;
    }
}
*/

/* 2.Two pointer Time complexity:O(n)
 * 
 * Compare "left" and "right" the smaller one move forward one index 
 */
public class solution11 {
    public int maxArea(int[] height) {
        int maxArea=0;
        int left =0;
        int right =height.length-1;
        while(left<right){
            int width = right - left;
            maxArea = Math.max(maxArea,Math.min(height[right], height[left])*width);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}