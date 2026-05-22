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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        if(p==null && q==null) return true;
19        if((p==null && q!=null)||(q==null && p!=null)) return false;
20        return (isSameTree(p.left, q.left)&& (p.val == q.val)&& isSameTree(p.right, q.right));
21    }
22    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
23        if(root == null && subRoot==null) return true;
24        if((root == null && subRoot!=null)||(root!=null && subRoot==null)) return false;
25        if(isSameTree(root,subRoot)) return true;
26        boolean left = isSubtree(root.left,subRoot);
27        boolean right = isSubtree(root.right,subRoot);
28        return left|| right;
29    }
30}