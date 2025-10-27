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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null || preorder.length ==0) return null;

        TreeNode root = new TreeNode(preorder[0]);

        for(int i=1 ; i < preorder.length; i++){
            insert(root , preorder[i]);
        }

        return root;
    }

    public void insert(TreeNode root, int val){
        while(true){
            if(val < root.val){
                if(root.left == null){
                    root.left = new TreeNode(val);
                    break;
                }
                else{
                    root = root.left;
                }
            }

            else{
                if(root.right == null){
                    root.right = new TreeNode(val);
                    break;
                }
                else{
                    root = root.right;
                }
            }
        }
    }
}