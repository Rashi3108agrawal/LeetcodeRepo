1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        if(root == null || p== root || q== root) return root;
14        TreeNode left = lowestCommonAncestor(root.left,p,q);
15        TreeNode right = lowestCommonAncestor(root.right,p,q);
16        if(left!= null && right!=null) return root;
17        return left!=null? left: right;
18    }
19}