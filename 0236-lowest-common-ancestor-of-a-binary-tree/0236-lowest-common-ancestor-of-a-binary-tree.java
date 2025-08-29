/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private boolean getPath(TreeNode root , ArrayList<Integer> arr , int x){
        if(root == null) return false;
        arr.add(root.val);

        if(root.val == x) return true;

        if(getPath(root.left , arr , x) || getPath(root.right , arr ,x)){
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;
    }

    public ArrayList<Integer> solve(TreeNode A , int B){
        ArrayList<Integer> arr = new ArrayList<>();
        if(A == null) return arr;
        getPath(A, arr , B);
        return arr;
    }


    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        ArrayList<Integer> getPath1 = new ArrayList<>();
        ArrayList<Integer> getPath2 = new ArrayList<>();


        getPath(root , getPath1 , p.val);
        getPath(root , getPath2 , q.val);

        int i = 0;
        while(i<getPath1.size() && i < getPath2.size()){
            if(!getPath1.get(i).equals(getPath2.get(i))) break;
            i++;
        }
        return new TreeNode(getPath1.get(i - 1));
    }
}