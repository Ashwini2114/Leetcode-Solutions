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
    public ListNode detectCycle(ListNode head) {
       if(head == null || head.next == null)
        {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                slow = head;
                while(slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;   
            }
        }
        return null;
    }
}

//Brute Force Approach
//         Map<ListNode, Integer> map = new HashMap<>();
//         ListNode temp = head;
//         if(head == null || head.next == null)
//         {
//             return null;
//         }
//         while(temp.next != null)
//         {
//             if(map.containsKey(temp))
//             {
//                 return temp;
//             }
//             map.put(temp, 1);
//             temp = temp.next;
//         }
//         return null;