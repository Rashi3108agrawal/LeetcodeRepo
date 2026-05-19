1class Solution {
2    public int robHelp(int[] nums) {
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
15    public int rob(int[] nums) {
16        int n = nums.length;
17        if(n==0) return 0;
18        if(n==1) return nums[0];
19        return Math.max(robHelp(Arrays.copyOfRange(nums,0,n-1)), robHelp(Arrays.copyOfRange(nums,1,n)));
20    }
21}