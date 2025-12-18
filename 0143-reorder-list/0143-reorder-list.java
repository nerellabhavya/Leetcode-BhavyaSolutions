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
    public void reorderList(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
      if(head==null||head.next==null)return ;
      while(fast.next!=null&&fast.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
      }
      ListNode prev=null;
      ListNode curr=slow.next;
      slow.next=null;
      while(curr!=null){
        ListNode newnode=curr.next;
        curr.next=prev;
        prev=curr;
        curr=newnode;
      }
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
    }
}