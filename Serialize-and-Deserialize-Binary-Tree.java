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
11public class Codec {
12
13    // Serializes a binary tree to a single string using BFS.
14    public String serialize(TreeNode root) {
15        if (root == null) return "null";
16
17        StringBuilder sb = new StringBuilder();
18        Queue<TreeNode> q = new LinkedList<>();
19        q.add(root);
20
21        while (!q.isEmpty()) {
22            TreeNode curr = q.poll();
23
24            if (curr == null) {
25                sb.append("null,");
26                continue;
27            }
28
29            sb.append(curr.val).append(",");
30            q.add(curr.left);
31            q.add(curr.right);
32        }
33
34        return sb.toString();
35    }
36
37    // Deserializes a string to a binary tree using BFS.
38    public TreeNode deserialize(String data) {
39        if (data.equals("null")) return null;
40
41        String[] arr = data.split(",");
42        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
43        Queue<TreeNode> q = new LinkedList<>();
44        q.add(root);
45
46        int i = 1;
47        while (!q.isEmpty() && i < arr.length) {
48            TreeNode curr = q.poll();
49
50            if (!arr[i].equals("null")) {
51                curr.left = new TreeNode(Integer.parseInt(arr[i]));
52                q.add(curr.left);
53            }
54            i++;
55            if (i >= arr.length) break;
56
57            if (!arr[i].equals("null")) {
58                curr.right = new TreeNode(Integer.parseInt(arr[i]));
59                q.add(curr.right);
60            }
61            i++;
62        }
63
64        return root;
65    }
66}
67
68// Usage:
69// Codec ser = new Codec();
70// Codec deser = new Codec();
71// TreeNode ans = deser.deserialize(ser.serialize(root));