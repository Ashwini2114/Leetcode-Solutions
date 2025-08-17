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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2 = l2;
        int carry = 0;
        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        while(h1 != null || h2 != null)
        {
            int sum = carry;
            if(h1 != null)
            {
                sum += h1.val;
                h1 = h1.next;
            } 
            if(h2 != null)
            {
                sum += h2.val;
                h2 = h2.next;
            }

            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;
        }
        if(carry != 0)
        {
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
            curr = curr.next;
        }
        return dummyHead.next;
    }
}