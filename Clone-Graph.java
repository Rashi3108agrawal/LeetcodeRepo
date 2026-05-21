1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public Node cloneGraph(Node node) {
23        if (node == null) return null;
24        Map<Node, Node> visited = new HashMap<>();     
25        return dfs(node, visited);  
26    } 
27
28    Node dfs(Node node, Map<Node, Node> visited) { 
29        if (visited.containsKey(node)) return visited.get(node); 
30
31        Node copy = new Node(node.val); 
32
33        visited.put(node,copy); 
34
35
36        for (Node neighbor : node.neighbors) { 
37            copy.neighbors.add(dfs(neighbor, visited)); 
38        } 
39
40        return copy;
41
42    }
43}