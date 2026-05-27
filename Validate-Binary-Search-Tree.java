1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean helper(TreeNode root, long min, long max){
18        if(root ==null) return true;
19        if(root.val<=min || root.val>= max) return false;
20        return helper(root.left,min, root.val ) && helper(root.right, root.val, max);
21    }
22    public boolean isValidBST(TreeNode root) {
23        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
24    }
25}