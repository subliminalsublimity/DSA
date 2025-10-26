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
class BSTIterator {
     
     private Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st =  new Stack<>();
        pushAll(root);
    }

    public boolean hasNext(){
        return !st.isEmpty();
    }

    public int next(){
        TreeNode temp = st.pop();
        pushAll(temp.right);
        return temp.val;
    }
    
    private void pushAll(TreeNode node){
        while(node != null){
            st.push(node);
            node = node.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */