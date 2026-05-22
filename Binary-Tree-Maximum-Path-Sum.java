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
17    int ans;
18    public int rec(TreeNode root){
19        if(root==null)
20            return 0;
21        int left=rec(root.left);
22        int right=rec(root.right);
23        ans=Math.max(ans, root.val+Math.max(left, 0)+Math.max(right, 0));
24        return root.val+Math.max(0, Math.max(left, right));
25    }
26    public int maxPathSum(TreeNode root) {
27        ans=Integer.MIN_VALUE;
28        rec(root);
29        return ans;
30    }
31}