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
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth = 0;
        HashMap<TreeNode,Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        map.put(root,0);
        while(!queue.isEmpty()){
            int size = queue.size();
            int left = map.get(queue.peek());
            for(int i=0;i<size;i++){
                TreeNode head = queue.poll();
                maxWidth = Math.max(maxWidth,map.get(head)-left+1);
                if(head.left!=null){
                    queue.offer(head.left);
                    map.put(head.left,2*map.get(head));
                }
                if(head.right!=null){
                    queue.offer(head.right);
                    map.put(head.right,2*map.get(head)+1);
                }
            }
        }
        return maxWidth;
    }
}