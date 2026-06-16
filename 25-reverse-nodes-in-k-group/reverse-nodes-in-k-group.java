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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1){
            return head;
        }
        int count=1;
        ListNode temp = head;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        int N = count/k;
        ListNode prevHead = null;
        ListNode currHead = head;
        ListNode ansNode = null;
        for(int i=0;i<N;i++){
            ListNode prev = null;
            ListNode curr = currHead;
            ListNode next = null;
            for(int j=0;j<k;j++){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if(prevHead==null){
                ansNode = prev;
            }else{
                prevHead.next = prev;
            }
            prevHead = currHead;
            currHead = curr;
        }
        prevHead.next = currHead;
        return ansNode;
        
    }
}