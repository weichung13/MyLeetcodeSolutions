/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example 1:
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * 
 * Example 2:
 * 
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * 
 * Example 3:
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */

 /*Time complexity : O(max(m,n)) */
public class solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Create a new listnode to store the sum 
        ListNode head = new ListNode();
        ListNode curr = head;
        //Store the carry number.
        int carry =0;
        while(l1!=null||l2!=null||carry!=0){
            int value1 = 0;
            if(l1!=null)value1 = l1.val;
            int value2 =0;
            if(l2!=null)value2 = l2.val;
            int sum = value1+value2+carry;
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
        }
        return head.next;
    }
}