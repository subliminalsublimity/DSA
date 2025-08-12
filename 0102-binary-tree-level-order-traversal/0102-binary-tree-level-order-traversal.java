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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> que = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if(root == null) return wrapList;
        que.offer(root);

        while(!que.isEmpty()){
            int levelNum = que.size();
        List<Integer> subList = new LinkedList<>();
        for(int  i=0 ;i<levelNum;i++){
            if(que.peek().left != null) que.offer(que.peek().left);
            if(que.peek().right != null) que.offer(que.peek().right);
            subList.add(que.poll().val);
        }
        wrapList.add(subList);
        }
        return wrapList;
    }
}