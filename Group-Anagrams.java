1class Solution {
2    public String sort(String s){
3        char[] ch = s.toCharArray();
4        Arrays.sort(ch);
5        return new String(ch);
6    }
7    public List<List<String>> groupAnagrams(String[] strs) {
8        List<List<String>> res= new ArrayList<>();
9        HashMap<String, List<String>> hm = new HashMap<>();
10        int n =strs.length;
11        for(int i=0;i<n;i++){
12            String sorted = sort(strs[i]);
13            if(!hm.containsKey(sorted)){
14                hm.put(sorted, new ArrayList<>());
15            }
16            hm.get(sorted).add(strs[i]);
17        }
18        for(List<String> temp : hm.values()){
19            res.add(temp);
20        }
21        return res;
22    }
23}