1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        for(char c: s.toCharArray()){
5            if(c == ']'){
6                if(st.isEmpty() || st.peek()!= '[') return false;
7                else st.pop();
8            }else if(c == '}'){
9                if(st.isEmpty() || st.peek()!= '{') return false;
10                else st.pop();
11            }else if(c == ')'){
12                if(st.isEmpty() || st.peek()!= '(') return false;
13                else st.pop();
14            }else{
15                st.push(c);
16            }
17        }
18        return st.isEmpty();
19    }
20}