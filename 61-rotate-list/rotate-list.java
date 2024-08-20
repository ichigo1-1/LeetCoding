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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Compute the length of the list
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        // Connect the last node to the head to form a cycle
        temp.next = head;

        // Calculate the number of rotations needed
        k = k % length;
        int stepsToNewHead = length - k;

        // Find the new head and break the cycle
        temp = head;
        for (int i = 0; i < stepsToNewHead - 1; i++) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }
}
