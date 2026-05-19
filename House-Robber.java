1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        int max = 0;
5        int dp[]= new int[n];
6        dp[0] = nums[0];
7        for(int i=1;i<n;i++){
8            int pick =nums[i], notpick=dp[i-1];
9            if(i>1) pick = dp[i-2] + nums[i];
10            if(i>1) notpick = Math.max(dp[i-1], dp[i-2]);
11            dp[i] = Math.max(pick, notpick);
12        }
13        return dp[n-1];
14    }
15}