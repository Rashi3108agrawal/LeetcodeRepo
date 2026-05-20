1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        int n=intervals.length;
4        
5        if(n==0)
6        {
7            return 0;
8        }
9
10        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
11
12        int cnt=0;
13        int prevEnd=intervals[0][1];
14
15        for(int i=1;i<n;i++)
16        {
17           if(intervals[i][0]<prevEnd)
18           {
19             cnt++;
20           }
21           else
22           {
23            prevEnd=intervals[i][1];
24           }
25        }
26        return cnt;
27    }
28}