1class Solution {
2    public int countSubstrings(String s) {
3        int n = s.length();
4        int cnt = 0;
5
6        for (int i = 0; i < n; i++) {
7            cnt += expandAroundCenter(s, i, i);     // odd-length palindromes
8            cnt += expandAroundCenter(s, i, i + 1); // even-length palindromes
9        }
10
11        return cnt;
12    }
13
14    private int expandAroundCenter(String s, int l, int r) {
15        int count = 0;
16        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
17            count++;
18            l--;
19            r++;
20        }
21        return count;
22    }
23}