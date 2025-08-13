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

        TreeNode curr = root , lastvis = null;

        while(curr != null || !st.isEmpty()){
            
            if(curr !=null){
                st.push(curr);
                curr = curr.left;
            }

            else{
                TreeNode peek = st.peek();
                if(peek.right != null && lastvis != peek.right){
                    curr = peek.right;
                }
                else{
                    st.pop();
                    postorder.add(peek.val);
                    lastvis = peek;
                }
            }

        }
        return postorder;
        
    }
}