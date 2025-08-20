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
 import java.util.*;
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int lH = Depth(root.left);
        int rH = Depth(root.right);

        return Math.abs(lH - rH) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    
    }

        public int Depth(TreeNode node){
            if(node == null) return 0;
            return 1 + Math.max(Depth(node.left) , Depth(node.right));
        }
}