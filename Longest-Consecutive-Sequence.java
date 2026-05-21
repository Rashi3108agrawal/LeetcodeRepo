1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> st = new HashSet<>();
4        if(nums.length ==0) return 0;
5        int len =1;
6        for(int num: nums){
7            st.add(num);
8        }
9        for(int num: st){
10            if(st.contains(num-1)) continue;
11            int currLen =1;
12            while(st.contains(num+1)){
13                currLen++;
14                num++;
15            }
16            len = Math.max(len, currLen);
17        }
18        return len;
19    }
20}