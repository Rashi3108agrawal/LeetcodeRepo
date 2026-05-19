1class Solution {
2    public int numDecodings(String s) {
3        int n = s.length();
4        int dp[] = new int[n+1];
5        if(s.charAt(0) =='0'){
6            return 0;
7        }
8        dp[0] =1;
9        dp[1] =1;
10        for(int i=2;i<=n;i++){
11            if(s.charAt(i-1)!= '0') dp[i]+= dp[i-1];
12            String temp = s.substring(i-2,i);
13            int val = Integer.valueOf(temp);
14            if(val>=10 && val<= 26){
15                dp[i] += dp[i-2];
16            }
17        }
18        return dp[n];
19    }
20}