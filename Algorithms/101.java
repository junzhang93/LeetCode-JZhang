/**
 * 101. Symmetric Tree
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }
    
    private boolean isSymmetric(TreeNode left, TreeNode right)
    {
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        return (left.val==right.val) 
        && isSymmetric(left.left, right.right) 
        && isSymmetric(left.right, right.left);
    }
}
