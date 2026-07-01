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
        // Edge case: empty list or single node without a cycle
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Determine if a cycle exists using Floyd's Tortoise and Hare
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Cycle detected
            if (slow == fast) {
                slow = head; // Reset slow to the head
                
                // Step 2: Move both pointers at the same speed until they meet
                while (slow != fast) {
                    slow = slow.next; // Move one step
                    fast = fast.next; // Move one step
                }
                return slow; // This is the start of the cycle
            }
        }

        return null; // No cycle found
    }
}