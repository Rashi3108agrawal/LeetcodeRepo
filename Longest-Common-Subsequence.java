1class Solution {
2
3    public int longestCommonSubsequence(String text1, String text2) {
4
5        int n = text1.length();
6        int m = text2.length();
7
8        int[][] dp = new int[n + 1][m + 1];
9
10        for (int i = 1; i <= n; i++) {
11
12            for (int j = 1; j <= m; j++) {
13
14                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
15
16                    dp[i][j] = 1 + dp[i - 1][j - 1];
17
18                } else {
19
20                    dp[i][j] = Math.max(
21                        dp[i - 1][j],
22                        dp[i][j - 1]
23                    );
24                }
25            }
26        }
27
28        return dp[n][m];
29    }
30}