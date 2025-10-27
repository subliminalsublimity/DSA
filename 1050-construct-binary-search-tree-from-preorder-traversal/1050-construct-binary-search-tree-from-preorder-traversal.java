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
    int preIndex = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        int[] inorder = preorder.clone();
        Arrays.sort(inorder);

        return buildTree(preorder , inorder, 0 , n-1 );
    }

    public TreeNode buildTree(int[] preorder , int [] inorder , int start , int end){
        if(start > end) return null;

        int rootVal = preorder[preIndex ++];
        TreeNode root = new TreeNode(rootVal);

        int mid = findIndex(inorder , rootVal , start , end);

        root.left = buildTree(preorder , inorder , start ,mid - 1);
        root.right = buildTree(preorder , inorder , mid + 1, end);

        return root;
    }

    public int findIndex(int [] inorder , int val , int start , int end){
        for(int i = start ; i<=end ; i++){
            if(inorder[i] == val) return i;
        }
        return -1;
    }
}