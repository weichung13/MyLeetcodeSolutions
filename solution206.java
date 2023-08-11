import java.util.Stack;

/**
 * Given the head of a singly linked list, reverse the list, and return the
 * reversed list.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * 
 * Example 2:
 * 
 * 
 * Input: head = [1,2]
 * Output: [2,1]
 * 
 * Example 3:
 * 
 * Input: head = []
 * Output: []
 */
public class solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
            
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(new ListNode(head.val));
            head = head.next;
        }

        ListNode start = stack.pop();
        head = start;

        while (!stack.isEmpty()) {
            start.next = stack.pop();
            start = start.next;
        }

        return head;

    }
}
