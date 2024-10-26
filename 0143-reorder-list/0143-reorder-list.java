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
        if(head==null || head.next==null)
        {
            return;
        }
        ListNode s = head;
        ListNode f = head;
        while(f.next!=null && f.next.next!= null)
        {
            s = s.next;
            f=f.next.next;
        }
        ListNode curr = s.next;
        s.next = null;
        ListNode prev = null;
        while(curr!=null)
        {
            ListNode currp1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currp1; 
        }
        ListNode left = head;
        ListNode right = prev;
        while(right!=null){
        ListNode leftp1 = left.next;
        ListNode rightp1 = right.next;
        left.next=right;
        right.next =leftp1;
        left = leftp1;
        right = rightp1;
        }

    }
}