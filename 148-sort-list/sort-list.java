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
    public ListNode convert(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public ListNode sortList(ListNode head) {
        // Step 1: Count the number of elements in the linked list
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Create an array with the correct size
        int[] arr = new int[count];

        // Step 3: Copy values from the linked list to the array
        temp = head;
        int i = 0;
        while (temp != null) {
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        if(arr.length==0)
        {
            return null;
        }
        // Step 4: Sort the array
        Arrays.sort(arr);

        // Step 5: Convert the sorted array back to a linked list
        return convert(arr);
    }
}