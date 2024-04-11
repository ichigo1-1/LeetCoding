/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //step 1: set the given node value to next value
        node.val=node.next.val;
        // ex:- node =5
        // 4 5 6 7 3
        // 4-6-6-7-5
        // 4-6--7-5
        node.next=node.next.next;

        
    }
}