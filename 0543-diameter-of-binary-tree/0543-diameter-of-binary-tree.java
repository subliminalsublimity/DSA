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
     int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       
        if(root == null) return 0 ;
        dfs(root);
        return dia;
    }

    public int dfs(TreeNode node){
        if(node == null) return 0;

        int Lh = dfs(node.left);
        int Rh = dfs(node.right);
        dia = Math.max(dia , Lh + Rh);
        return Math.max(Lh,Rh) + 1;
    }
}