// Time Complexity: O(n)
// Space Complexity: O(H)

// We recursively call in a DFS traversal, ensuring each subtree we send is a mirror 

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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return isMirror(root.left, root.right);
        
    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;

        else if (left == null || right == null) return false;

        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
