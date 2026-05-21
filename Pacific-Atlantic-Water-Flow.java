1class Solution {
2
3    public List<List<Integer>> pacificAtlantic(int[][] heights) {
4
5        int n = heights.length;
6        int m = heights[0].length;
7
8        boolean[][] pacific = new boolean[n][m];
9        boolean[][] atlantic = new boolean[n][m];
10
11        Queue<int[]> qp = new LinkedList<>();
12        Queue<int[]> qa = new LinkedList<>();
13
14        // Pacific: top row + left column
15        for (int i = 0; i < n; i++) {
16            qp.add(new int[]{i, 0});
17            pacific[i][0] = true;
18        }
19        for (int j = 0; j < m; j++) {
20            qp.add(new int[]{0, j});
21            pacific[0][j] = true;
22        }
23
24        // Atlantic: bottom row + right column
25        for (int i = 0; i < n; i++) {
26            qa.add(new int[]{i, m - 1});
27            atlantic[i][m - 1] = true;
28        }
29        for (int j = 0; j < m; j++) {
30            qa.add(new int[]{n - 1, j});
31            atlantic[n - 1][j] = true;
32        }
33
34        bfs(heights, qp, pacific);
35        bfs(heights, qa, atlantic);
36
37        List<List<Integer>> res = new ArrayList<>();
38
39        for (int i = 0; i < n; i++) {
40            for (int j = 0; j < m; j++) {
41                if (pacific[i][j] && atlantic[i][j]) {
42                    res.add(Arrays.asList(i, j));
43                }
44            }
45        }
46
47        return res;
48    }
49
50    private void bfs(int[][] h, Queue<int[]> q, boolean[][] vis) {
51
52        int n = h.length, m = h[0].length;
53
54        int[] dx = {-1, 0, 1, 0};
55        int[] dy = {0, -1, 0, 1};
56
57        while (!q.isEmpty()) {
58
59            int[] cur = q.poll();
60            int x = cur[0], y = cur[1];
61
62            for (int d = 0; d < 4; d++) {
63
64                int nx = x + dx[d];
65                int ny = y + dy[d];
66
67                if (nx >= 0 && nx < n && ny >= 0 && ny < m
68                        && !vis[nx][ny]
69                        && h[nx][ny] >= h[x][y]) {
70
71                    vis[nx][ny] = true;
72                    q.add(new int[]{nx, ny});
73                }
74            }
75        }
76    }
77}