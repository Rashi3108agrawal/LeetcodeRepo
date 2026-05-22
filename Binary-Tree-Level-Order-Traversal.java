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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> res = new ArrayList<>();
19        if(root ==null) return res;
20        Queue<TreeNode> q= new LinkedList<>();
21        q.add(root);
22        while(!q.isEmpty()){
23            int size = q.size();
24            List<Integer> temp = new ArrayList<>();
25            for(int i=0;i<size;i++){
26                TreeNode node = q.remove();
27                temp.add(node.val);
28                if(node.left!= null){
29                    q.add(node.left);
30                }
31                if(node.right!=null){
32                    q.add(node.right);
33                }
34            } 
35            res.add(temp);
36        }
37        return res;
38    }
39}