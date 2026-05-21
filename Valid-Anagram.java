1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] arr1=s.toCharArray();
4        char[] arr2=t.toCharArray();
5
6        Arrays.sort(arr1);
7        Arrays.sort(arr2);
8
9        if(Arrays.equals(arr1,arr2)){
10            return true;
11        }else{
12            return false;
13        }
14        
15    }
16}