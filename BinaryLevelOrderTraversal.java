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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> level = new ArrayList<Integer>();
        recurTraverse(result,root, 0);
        return result;
    }
    
    public void recurTraverse(List<List<Integer>> result, TreeNode root, int height){
        List<Integer> newLevel;
        if(root == null) return;
        if(!result.get(height)){
            newLevel =new ArrayList<Integer>();    
            result.add(newLevel);
            result.get(height).add(root.val);
        }else{
            result.get(height).add(root.val);
        }
        if(root.left != null){
            recurTraverse(result, root.left, height+1);
        }
        if(root.right != null){
            recurTraverse(result, root.right, height+1);
        }

        }
               
    }

