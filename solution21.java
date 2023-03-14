/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * Merge the two lists in a one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * 
 * Return the head of the merged linked list.
 * 
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4] 
 */
public class solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        ListNode head = node;

        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                head.next = list1;
                list1 = list1.next;
            }else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }

        if(list1!=null){
            head.next = list1;
            list1= list1.next;
        }

        if(list2!=null){
            head.next = list2;
            list2 = list2.next;
        }

        return node.next;
    }
}