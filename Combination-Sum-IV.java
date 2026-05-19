1class Solution {
2    public int combinationSum4(int[] nums, int target) {
3        int dp[] = new int[target+1];
4        dp[0] =1;
5        for(int i=1;i<= target;i++){
6            for(int num: nums){
7                if(num<=i){
8                    dp[i] += dp[i-num];
9                }
10            }
11        }
12        return dp[target];
13    }
14}