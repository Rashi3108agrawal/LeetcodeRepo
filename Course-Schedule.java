1class Solution {
2
3    public boolean cycle(List<List<Integer>> adj, int node, boolean[] vis, boolean[] par) {
4        vis[node] = true;
5        par[node] = true;
6
7        for (int nei : adj.get(node)) {
8
9            // Case 1: unvisited neighbor
10            if (!vis[nei]) {
11                if (cycle(adj, nei, vis, par)) return true;
12            }
13            // Case 2: visited and still in recursion stack → cycle
14            else if (par[nei]) {
15                return true;
16            }
17        }
18
19        par[node] = false; // backtrack
20        return false;
21    }
22
23    public boolean canFinish(int numCourses, int[][] pre) {
24
25        List<List<Integer>> adj = new ArrayList<>();
26        for (int i = 0; i < numCourses; i++) {
27            adj.add(new ArrayList<>());
28        }
29
30        // build graph
31        for (int[] p : pre) {
32            adj.get(p[0]).add(p[1]);
33        }
34
35        boolean[] vis = new boolean[numCourses];
36        boolean[] par = new boolean[numCourses];
37
38        // check cycle from every node
39        for (int i = 0; i < numCourses; i++) {
40            if (!vis[i]) {
41                if (cycle(adj, i, vis, par)) {
42                    return false;
43                }
44            }
45        }
46        return true;
47    }
48}
49