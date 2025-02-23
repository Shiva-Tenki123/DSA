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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reverseNode=reverse(slow.next);
        while(reverseNode!=null){
            if(reverseNode.val!=head.val){
                return false;
            }
            reverseNode=reverseNode.next;
            head=head.next;
        }
        return true;

    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode pre=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;

        }
        return pre;
    }
    
}