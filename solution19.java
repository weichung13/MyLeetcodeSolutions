/**
 * Given the head of a linked list, remove the nth node from the end of the list
 * and return its head.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * 
 * Example 2:
 * 
 * Input: head = [1], n = 1
 * Output: []
 * Example 3:
 * 
 * Input: head = [1,2], n = 1
 * Output: [1]
 */
public class solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode();
        node.next = head;
        ListNode left = node;
        ListNode right = node;
        for(int i =0 ;i<n;i++){
            right = right.next;
        }
        while(right.next!=null){
            left = left.next;
            right = right.next;
        }
        //skip the node that need to be removed
        left.next = left.next.next;
        return node.next; 
    }
}
