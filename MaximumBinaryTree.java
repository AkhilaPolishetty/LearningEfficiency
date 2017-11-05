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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructs(nums, 0, nums.length-1);
    }
    
    public TreeNode constructs(int[] nums, int l,  int r){
        TreeNode x;
        if( l == r){
            x = new TreeNode(nums[l]);
            return x;
        }
        if(l > r) return null;
        
        int index = max(nums, l, r); 
        x = new TreeNode(nums[index]);
        x.left = constructs(nums, l, index-1);
        x.right = constructs(nums, index+1, r);    
        
        return x;
    }

    public int max(int[] nums, int i, int j){
        if(i==j) return i;
        int index =0;
        while(i < j){
            if(nums[i] <nums[j]){
                index = j;
                i++;
            }else{
                index =i;
                j--;
            }  
        }
        return index;
    }
            
    }

