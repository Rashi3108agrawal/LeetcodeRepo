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
11            if(!dp[i]) continue;
12            for(int j=i+1;j<=n;j++){
13                String temp = s.substring(i,j);
14                if(st.contains(temp)&& dp[i]){
15                    dp[j] = true;
16                }
17            }
18        }
19        return dp[n];
20    }
21}