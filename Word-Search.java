1class Solution {
2
3    public boolean helper(char[][] board, String word, int x, int y, int idx,int m, int n, boolean vis[][]){
4        if(idx == word.length()) return true;
5        if(x>=m || y>=n|| x<0|| y<0) return false;
6        if(vis[x][y]) return false;
7        vis[x][y] = true;
8        if(board[x][y] == word.charAt(idx)){
9            boolean up = helper(board, word, x-1,y, idx+1,m,n, vis);
10            boolean down = helper(board, word, x+1,y, idx+1,m,n, vis);
11            boolean left = helper(board, word, x,y-1, idx+1,m,n, vis);
12            boolean right = helper(board, word, x,y+1, idx+1,m,n, vis);
13            if(up|| down || left|| right) return true;
14        }
15        vis[x][y] = false;
16        return false;
17    }
18    public boolean exist(char[][] board, String word) {
19        int m = board.length;
20        int n = board[0].length;
21
22        for(int i=0;i<m;i++){
23            for(int j=0;j<n;j++){
24                boolean vis[][] = new boolean[m][n];
25                if(helper(board, word,i,j,0,m,n,vis)) return true;
26            }
27        }
28        return false;
29    }
30}