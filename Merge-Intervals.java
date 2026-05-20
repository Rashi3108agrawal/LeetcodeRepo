1class Solution {
2    public int[][] merge(int[][] intervals) {
3
4        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
5
6        List<int[]> res = new ArrayList<>();
7
8        for (int[] interval : intervals) {
9
10            // no overlap
11            if (res.isEmpty() || res.get(res.size() - 1)[1] < interval[0]) {
12                res.add(interval);
13            }
14            // overlap
15            else {
16                res.get(res.size() - 1)[1] =
17                    Math.max(res.get(res.size() - 1)[1], interval[1]);
18            }
19        }
20
21        return res.toArray(new int[res.size()][]);
22    }
23}