1class Solution {
2    public String longestPalindrome(String s) {
3        int n = s.length();
4
5        int start = 0;
6        int end = 0;
7
8        for (int i = 0; i < n; i++) {
9
10            // Odd length palindrome
11            int len1 = expand(s, i, i);
12
13            // Even length palindrome
14            int len2 = expand(s, i, i + 1);
15
16            int len = Math.max(len1, len2);
17
18            if (len > end - start + 1) {
19                start = i - (len - 1) / 2;
20                end = i + len / 2;
21            }
22        }
23
24        return s.substring(start, end + 1);
25    }
26
27    private int expand(String s, int l, int r) {
28
29        while (l >= 0 &&
30               r < s.length() &&
31               s.charAt(l) == s.charAt(r)) {
32
33            l--;
34            r++;
35        }
36
37        return r - l - 1;
38    }
39}