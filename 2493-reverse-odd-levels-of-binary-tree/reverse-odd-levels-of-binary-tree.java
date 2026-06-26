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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean odd = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<TreeNode> nodes = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                nodes.add(node);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            if(odd) reverse(nodes);
            odd = !odd;
        }
        return root;
    }

    public void reverse(List<TreeNode> nodes){
        int start = 0,end = nodes.size()-1;
        while(start<end){
            int temp = nodes.get(start).val;
            nodes.get(start).val = nodes.get(end).val;
            nodes.get(end).val = temp;
            start++;
            end--;
        }
        
    }
}