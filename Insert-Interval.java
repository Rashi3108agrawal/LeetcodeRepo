1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        int n = intervals.length;
4        ArrayList<int[]> res = new ArrayList<>();
5        int i=0;
6        while(i<n && intervals[i][1]< newInterval[0]){
7            res.add(intervals[i]);
8            i++;
9        }
10
11        while(i<n && intervals[i][0]<= newInterval[1]){
12            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
13            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
14            i++;
15        }
16        res.add(newInterval);
17
18        while(i<n){
19            res.add(intervals[i]);
20            i++;
21        }
22        return res.toArray(new int[res.size()][]);
23    }
24}