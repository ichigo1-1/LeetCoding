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
    public ListNode findk(ListNode head,int k)
    {
        int count=1;
        while(head!=null)
        {
            if(count==k)
            {
                return head;
            }
            count++;
            head=head.next;
        }
        return null;

//         k = k-1;

// while(k>0){

// k--;

// head=head.next;

}



    
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null)
        {
            return null;
        }
            
        ListNode tail = head;

        int length = 1;

        while(tail.next!= null){

        length++;

        tail = tail.next;

        }

        if(k%length == 0){

        return head;

        }

        k = k%length;

        tail.next = head;

        ListNode newLastNode = findk(head , length-k);

        head =newLastNode.next;

        newLastNode.next = null;

        return head;

    }
}