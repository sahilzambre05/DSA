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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverse(slow);

        ListNode temp1 = head,temp2 = rev;
        int ans=0;
        while(temp2!=null){
            ans = Math.max(ans,temp1.val+temp2.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return ans;
        
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
}