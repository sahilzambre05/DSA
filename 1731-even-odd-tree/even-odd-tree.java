/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isEven = true;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int prev = (isEven) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                int curr = node.val;

                if(((isEven) && (curr%2==0 || prev>=curr)) || ((!isEven) && (curr%2!=0 || prev<=curr))) return false;

                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
                prev = curr;
            }
            isEven = !isEven;
        }
        return true;
    }
}