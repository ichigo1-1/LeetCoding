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
    public ListNode evenwala(ListNode head)
    {
        if(head==null)
        {
            return null;
        }
        ListNode prev=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
     public ListNode oddwala(ListNode head)
    {
        if(head==null)
        {
            return null;
        }
        ListNode prev=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        if(c%2==0)
        {
            return evenwala(head);
        }
        
            return oddwala(head);
        
    }
}