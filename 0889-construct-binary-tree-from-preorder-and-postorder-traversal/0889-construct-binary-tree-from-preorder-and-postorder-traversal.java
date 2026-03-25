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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n = preorder.length;
        return build(0,n-1,0,n-1,preorder,postorder);
    }
    public static TreeNode build(int i,int j,int p,int q,int[] preorder, int[] postorder){
        if(i >j) return null;
        int val = preorder[i];
        TreeNode node = new TreeNode(val);
        while(i == j) return node;
        int leftRoot = preorder[i+1];
        int idx = p;

        while(postorder[idx] != leftRoot) idx++;
           int leftSide = idx-p+1;
           node.left = build(i+1,leftSide+i,p,idx,preorder,postorder);
           node.right = build(leftSide+i+1,j,idx+1,q-1,preorder,postorder);
        return node;
    }
}