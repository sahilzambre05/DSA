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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<TreeNode> nodes;
        while(!queue.isEmpty()){
            int size = queue.size();
            nodes = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                nodes.add(node);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            if(queue.isEmpty()){
                int ans = 0;
                for(int i=0;i<nodes.size();i++){
                    ans+=nodes.get(i).val;
                }
                return ans;
            }
        }

        return 0;
    }
}