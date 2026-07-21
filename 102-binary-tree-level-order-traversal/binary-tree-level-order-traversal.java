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
        List<List<Integer>> list = new ArrayList<>();
        binarytree(root, 0, list);
        return list;
    }
    
    public void binarytree(TreeNode root, int level, List<List<Integer>> list) {
        // Base case: if the node is null, return
        if (root == null) {
            return;
        }
        
        // If we reach a new level that doesn't have a list yet, create a new sublist
        if (level == list.size()) {
            list.add(new ArrayList<>());
        }
        
        // Add the current node's value to its corresponding level list
        list.get(level).add(root.val);
        
        // Recursively traverse left and right children, incrementing the level
        binarytree(root.left, level + 1, list);
        binarytree(root.right, level + 1, list);
    }
}