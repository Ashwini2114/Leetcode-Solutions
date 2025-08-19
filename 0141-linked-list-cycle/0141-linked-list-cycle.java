/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
        {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }
}

// BRUTE FORCE APPROACH
//         Map<ListNode, Integer> map = new HashMap<>();
//         ListNode temp = head;
//         if(head == null || head.next == null)
//         {
//             return false;
//         }
//         while(temp.next != null)
//         {
//             if(map.containsKey(temp))
//             {
//                 return true;
//             }
//             map.put(temp, 1);
//             temp = temp.next;
//         }
//         return false;