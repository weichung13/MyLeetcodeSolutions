/**
 * Given a binary tree, determine if it is
 * height-balanced
 * .
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * 
 * Example 2:
 * 
 * 
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * 
 * Example 3:
 * 
 * Input: root = []
 * Output: true
 * 
 * 
 */

public class solution110 {
    public boolean isBalanced(TreeNode root) {
        return count(root)!= 0;
    }

    //a function help counting subtree
    public int count (TreeNode node){
        if(node == null) return 1;

        int left = count(node.left);
        int right = count(node.right);

        //if the two subtrees of every node differs more than one, return 0 as false

        //if(left==0 or right ==0) also return 0, so combine it
        if(left == 0 || right == 0|| Math.abs(left-right)>1)return 0;

        //plus 1 for there's an original root
        return Math.max(left, right)+1;
    }
}
