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
    public ListNode middleNode(ListNode head) {
        ListNode slow= head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

// Brute Force Approach
        // ListNode temp = head;
        // int count = 0;
        // while(temp != null)
        // {
        //     count += 1;
        //     temp = temp.next;
        // }
        // temp = head;
        // int n = (count/2)+1;
        // for(int i = 1; i < n; i++)
        // {
        //     temp = temp.next;
        // }
        // return temp;