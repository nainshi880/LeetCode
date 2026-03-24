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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0,n-1,0,n-1,postorder,inorder);
    }
     public static TreeNode build(int p,int q,int i,int j,int[] postorder, int[] inorder){

        if(i > j || p > q) return null;
        int n = inorder.length;
        int val = postorder[q];
        TreeNode node = new TreeNode(val);
        int r = 0;

        for(int k=i;k<=j;k++){
             if(inorder[k] == val){
                r = k;
                break;
             }
        }

        int count = r-i;
        node.left = build(p,count+p-1,i,r-1,postorder,inorder);
        node.right = build(p+count,q-1,r+1,j,postorder,inorder);
          return node;
    }
}