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

class Tuple {
    TreeNode node;
    int row; // column index (x-axis)
    int col; // row index (y-axis)

    public Tuple(TreeNode _node, int _row, int _col) {
        node = _node;
        row = _row;
        col = _col;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // x -> column, y -> row, PriorityQueue -> sorted nodes at same position
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> mpp = new TreeMap<>();
        Queue<Tuple> que = new LinkedList<>();
        que.offer(new Tuple(root, 0, 0));

        while (!que.isEmpty()) {
            Tuple tuple = que.poll();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            // if column not present, add new TreeMap
            if (!mpp.containsKey(x)) {
                mpp.put(x, new TreeMap<>());
            }

            // if row not present for this column, add new PriorityQueue
            if (!mpp.get(x).containsKey(y)) {
                mpp.get(x).put(y, new PriorityQueue<>());
            }

            // add current node value
            mpp.get(x).get(y).offer(node.val);

            // left child -> column - 1, row + 1
            if (node.left != null) {
                que.offer(new Tuple(node.left, x - 1, y + 1));
            }

            // right child -> column + 1, row + 1
            if (node.right != null) {
                que.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }

        
        List<List<Integer>> ls = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : mpp.values()) {
            List<Integer> colList = new ArrayList<>();
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    colList.add(nodes.poll());
                }
            }
            ls.add(colList);
        }

        return ls;
    }
}
