/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;

        // Get the size of the LL
        int count = 0;
        while(temp != null)
        {
            count += 1;
            temp = temp.next;
        }
        // Get the position of the node to delete from start
        int k = count - n + 1;
        if(head == null)
        {
            return head;
        }
        if(k == 1)
        {
            head = head.next;
            return head;
        }
        count = 0;
        temp = head;
        ListNode prev = null;
        while(temp != null)
        {
            count += 1;
            if(count == k)
            {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}