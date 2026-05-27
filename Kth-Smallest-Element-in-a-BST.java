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
17    int nCount = 0;
18    int ans = 0;
19    public int kthSmallest(TreeNode root, int k) {
20        inorder(root, k);
21        return ans;
22    }
23
24    void inorder(TreeNode node, int k) {
25        if(node == null) return;
26        inorder(node.left, k);
27            nCount++;
28            if(nCount == k) {
29                ans = node.val;
30                return;
31            }
32        inorder(node.right, k);
33    }
34}