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
public class Solution {
    public static ListNode convert(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Check if either list is empty
        if (list1 == null && list2 == null) {
            return null; // Both lists are empty
        } else if (list1 == null) {
            return list2; // List 1 is empty, return List 2
        } else if (list2 == null) {
            return list1; // List 2 is empty, return List 1
        }

        ListNode first1 = list1;
        ListNode second1 = list2;

        // Get the sizes of the linked lists
        int size1 = getSize(first1);
        int size2 = getSize(second1);

        // Create arrays based on the sizes
        int[] arr = new int[size1 + size2];
        int i = 0;

        // Copy elements from the first linked list
        while (first1 != null) {
            arr[i] = first1.val;
            first1 = first1.next;
            i++;
        }

        // Copy elements from the second linked list
        while (second1 != null) {
            arr[i] = second1.val;
            second1 = second1.next;
            i++;
        }

        // Sort the array
        Arrays.sort(arr);

        // Convert the sorted array back to a linked list
        ListNode head = convert(arr);
        return head;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode list1 = convert(new int[]{1, 3, 5});
        ListNode list2 = convert(new int[]{2, 4, 6});

        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}