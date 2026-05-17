1class Solution {
2    public int change(int amount, int[] coins) {
3        int dp[] = new int[amount+1];
4        dp[0] =1;
5        for(int coin: coins){
6            for(int amt =1; amt<= amount; amt++){
7                if(amt>= coin) dp[amt] += dp[amt-coin];
8            }
9        }
10        return dp[amount];
11    }
12}
13
14// Synced seamlessly with LeetHub Pro
15// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
16// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna