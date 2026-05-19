1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        int n = s.length();
4        boolean [] dp = new boolean [n+1];
5        Set<String> st = new HashSet<>();
6        for(String word: wordDict){
7            st.add(word);
8        }
9        dp[0]= true;
10        for(int i=0;i<=n;i++){
11            for(int j=i+1;j<=n;j++){
12                String temp = s.substring(i,j);
13                if(st.contains(temp)&& dp[i]){
14                    dp[j] = true;
15                }
16            }
17        }
18        return dp[n];
19    }
20}