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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
      return  build(0,n-1,0,n-1,preorder,inorder);
    }

    public static TreeNode build(int p,int q,int i,int j,int[] preorder, int[] inorder){

        if(i > j || p > q) return null;
        int val = preorder[p];
        TreeNode node = new TreeNode(val);
        int r = 0;

        for(int k=i;k<=j;k++){
             if(inorder[k] == val){
                r = k;
                break;
             }
        }

        int count = r-i;
        node.left = build(p+1,count+p,i,r-1,preorder,inorder);
        node.right = build(p+count+1,q,r+1,j,preorder,inorder);
          return node;
    }
}