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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int len = 1;
        ListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
            len++;
        }
        
        k = k%len;

        if(k==0) return head;

        curr.next = head;
        curr = curr.next;

        int n = len-k;
        int count=1;
        while(curr!=null){
            if(count==n){
                break;
            }
            count++;
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}