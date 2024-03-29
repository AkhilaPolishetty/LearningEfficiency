/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MergingBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        if(t1 == null && t2 == null) return null;
       
        int val = (t1 == null? 0 : t1.val) + (t2 == null? 0 : t2.val);
        TreeNode res = new TreeNode(val);
        //res.val = val;
        
        res.left = mergeTrees(t1 == null? null : t1.left, t2 == null? null : t2.left);
        res.right = mergeTrees(t1 == null? null : t1.right , t2 == null? null : t2.right);
     
        return res;
    }
}