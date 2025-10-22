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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root , lastVis = null;

        while(curr != null ||!st.isEmpty()){
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }

            else{
                if(st.peek().right != null && lastVis != st.peek().right){
                    curr = st.peek().right;
                }
                else{
                   TreeNode node = st.pop();
                    postorder.add(node.val);
                    lastVis = node;
                }
            }
        }
        return postorder;

    }
}