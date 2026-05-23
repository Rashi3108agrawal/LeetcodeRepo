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
17    public TreeNode help(int[] pre, int ps, int pe, int[]in, int is, int ie, HashMap<Integer, Integer> mp){
18        if(ps>pe || is>ie) return null;
19        int val = pre[ps];
20        TreeNode root = new TreeNode(val);
21        int idx = mp.get(val);
22        int ele = idx-is;
23        root.left = help(pre, ps+1, ps+ele, in, is, idx-1,mp);
24        root.right = help(pre, ps+ele+1,pe, in, idx+1, ie, mp);
25        return root;
26    }
27    public TreeNode buildTree(int[] preorder, int[] inorder) {
28        HashMap<Integer, Integer> mp = new HashMap<>();
29        int n = preorder.length;
30        for(int i=0;i<n;i++){
31            mp.put(inorder[i],i);
32        }
33        TreeNode root = help(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, mp);
34        return root;
35    }
36}