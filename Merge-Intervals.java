1class Solution {
2    public int[][] merge(int[][] intervals) {
3        int n = intervals.length;
4        List<int[]> res = new ArrayList<>();
5        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
6        int lstSt= intervals[0][0];
7        int lstEnd = intervals[0][1];
8
9        for(int i=1;i<n;i++){
10            if(intervals[i][0]<=lstEnd){
11                lstSt = Math.min(lstSt, intervals[i][0]);
12                lstEnd = Math.max(lstEnd, intervals[i][1]);
13            }else{
14                res.add(new int[]{lstSt, lstEnd});
15                lstSt = intervals[i][0];
16                lstEnd = intervals[i][1];
17            }
18        }
19        res.add(new int[]{lstSt, lstEnd});
20        return res.toArray(new int[res.size()][]);
21    }
22}