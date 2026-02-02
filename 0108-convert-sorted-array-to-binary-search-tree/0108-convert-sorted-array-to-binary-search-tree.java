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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(0,nums.length-1,nums);
    }
    public TreeNode helper(int start,int end,int[] nums){
        int mid = (start + end)/2;
        if(start > end){
            return null;
        }
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(start,mid-1,nums);
        root.right = helper(mid+1,end,nums);
        return root;
    }
}