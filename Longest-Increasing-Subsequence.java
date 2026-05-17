1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        Arrays.fill(dp, 1);  // every element itself
6
7        for (int i = 0; i < n; i++) {
8            for (int j = 0; j < i; j++) {
9                if (nums[j] < nums[i]) {
10                    dp[i] = Math.max(dp[i], dp[j] + 1);
11                }
12            }
13        }
14
15        int ans = 0;
16        for (int val : dp) ans = Math.max(ans, val);
17        return ans;
18    }
19}