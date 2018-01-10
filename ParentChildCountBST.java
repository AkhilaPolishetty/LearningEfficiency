
class TreeNode{
	TreeNode left;
	TreeNode right;
	int value =0;
	public TreeNode(int val){
		this.value = val;
		left = right = null;
	}

}
class ParentChildCountBST{
	public static int count = 0;
	public static int BSTParentChildCount(TreeNode root){
	TreeNode curr = root;
	return helper(curr);
	 
	}

	static int helper(TreeNode root){
	
	if(root == null) return 0;
	if( root.left != null || root.right != null) count++;

	helper(root.left);
	helper(root.right);

		return count;
	}

	public static void main(String[] args){

			int count =0;
			ParentChildCountBST obj = new ParentChildCountBST();
			TreeNode node = new TreeNode(2);
			node.right = new TreeNode(10);
			node.left = new TreeNode(11);
			node.left.left = new TreeNode(3);

			count = BSTParentChildCount(node);
			System.out.println(count);
	}
}

