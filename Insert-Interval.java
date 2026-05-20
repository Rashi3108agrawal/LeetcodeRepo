1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3
4        List<int[]> res = new ArrayList<>();
5        int i = 0;
6        int n = intervals.length;
7
8        // 1. Add all intervals before newInterval
9        while (i < n && intervals[i][1] < newInterval[0]) {
10            res.add(intervals[i]);
11            i++;
12        }
13
14        // 2. Merge overlapping intervals
15        while (i < n && intervals[i][0] <= newInterval[1]) {
16
17            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
18            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
19
20            i++;
21        }
22
23        res.add(newInterval);
24
25        // 3. Add remaining intervals
26        while (i < n) {
27            res.add(intervals[i]);
28            i++;
29        }
30
31        return res.toArray(new int[res.size()][]);
32    }
33}