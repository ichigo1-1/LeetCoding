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
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        
        int result=count-n;
        if(result==0)
        {
            head=head.next;
            return head;
        }
        temp=head;
        while(temp!=null)
        {
            result--;
            if(result==0)
            {
                break;
            }
            temp=temp.next;
        }
        ListNode delNode=temp.next;
        temp.next=temp.next.next;
        delNode.next=null;
        return head;



        
    }
}