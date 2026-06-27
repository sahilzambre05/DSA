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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null){
            return null;
        }
        return buildTree(nums,0,nums.length-1);
    }

    public TreeNode buildTree(int[] nums,int start,int end){
        if(start>end) return null;

        int idxMax = start;
        for(int i=start+1;i<=end;i++){
            if(nums[i]>nums[idxMax]){
                idxMax = i;
            }
        }

        TreeNode root = new TreeNode(nums[idxMax]);

        root.left = buildTree(nums,start,idxMax-1);
        root.right = buildTree(nums,idxMax+1,end);

        return root;

    }
}