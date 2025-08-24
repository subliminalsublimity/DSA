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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        boolean LToR = true;

        while(!que.isEmpty()){
            int size = que.size();
            Integer temp[] = new Integer[size];

            for(int i=0 ; i<size;i++){
                TreeNode node = que.poll();

                int idx = LToR ? i : size - i - 1;
                temp[idx] = node.val;
            

            if(node.left != null) que.offer(node.left);
            if(node.right != null) que.offer(node.right);
        }

        res.add(Arrays.asList(temp));
        LToR = !LToR;
        
    }
    return res;
    }
}