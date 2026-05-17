class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int amt =1; amt<= amount;amt++){
            for(int coin: coins){
                if(coin<= amt && dp[amt - coin] != Integer.MAX_VALUE){
                    dp[amt] = Math.min(dp[amt], 1+ dp[amt-coin]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE? -1: dp[amount];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna