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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            depth--;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if(depth!=1){
                    if(temp.left!=null) queue.offer(temp.left);
                    if(temp.right!=null) queue.offer(temp.right);
                }
                if(depth==1){
                    TreeNode left = temp.left;
                    TreeNode right = temp.right;
                    temp.left  = new TreeNode(val);
                    temp.right  = new TreeNode(val);
                    temp.left.left = left;
                    temp.right.right = right;
                }
            }
        }
        return root;
    }
}