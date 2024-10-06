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
     public ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftprev=null,leftnode=null;
        ListNode rightnext=null,rightnode=null;
        ListNode temp=head;
        int c=1;
        while(temp!=null)
        {
            if(c==left)
            {
                leftnode=temp;
            }
            else if(c==right && leftnode!=null)
            {
                rightnode=temp;
                rightnext=temp.next;

                //separte it to reverse
                rightnode.next=null;
                ListNode newhead=reverse(leftnode);

                //now check if leftprev exist if it connect else newhead is the new head;
                if(leftprev!=null)
                {
                    leftprev.next=newhead;
                }
                else{
                    head=newhead;
                }
                //connect the one we disconnected for reverse purposes
                leftnode.next=rightnext;
                break;
            }
            if(leftnode==null)
            {
                leftprev=temp;
            }
            temp=temp.next;
            c++;
        }
        return head;
    }
}