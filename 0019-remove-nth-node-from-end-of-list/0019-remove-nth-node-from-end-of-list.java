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
        ListNode fast = head;
        for(int i = 0; i < n; i++)
        {
            fast = fast.next;
        }
        if(fast == null)
        {
            return head.next;
        }
        ListNode slow = head;
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }      
}
//BRUTE FORCE BY ME
    // // Get the size of the LL
    //     ListNode temp = head;
    //     int count = 0;
    //     while(temp != null)
    //     {
    //         count += 1;
    //         temp = temp.next;
    //     }
    //     // Get the position of the node to delete from start
    //     int k = count - n + 1;
    //     if(head == null)
    //     {
    //         return head;
    //     }
    //     if(k == 1)
    //     {
    //         head = head.next;
    //         return head;
    //     }
    //     count = 0;
    //     temp = head;
    //     ListNode prev = null;
    //     while(temp != null)
    //     {
    //         count += 1;
    //         if(count == k)
    //         {
    //             prev.next = prev.next.next;
    //             break;
    //         }
    //         prev = temp;
    //         temp = temp.next;
    //     }
    //     return head;


//BRUTE FORCE STRIVER
    // ListNode temp = head;
    //     int count = 0;
    //     while(temp != null)
    //     {
    //         count += 1;
    //         temp = temp.next;
    //     }

    //     if(count == n)
    //     {
    //         head = head.next;
    //         return head;
    //     }
    //     int res = count - n;
    //     temp = head;
    //     while(temp != null)
    //     {
    //         res -= 1;
    //         if(res == 0)
    //         {
    //             break;
    //         }
    //         temp = temp.next;
    //     }
    //     temp.next = temp.next.next;
    //     return head;