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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root , inorder);
        return inorder.get(k-1);
    }

    public void inorderTraversal(TreeNode root , List<Integer> list){
        if(root == null) return;

        inorderTraversal(root.left , list);
        list.add(root.val);
        inorderTraversal(root.right , list);

    }
}