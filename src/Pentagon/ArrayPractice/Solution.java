package Pentagon.ArrayPractice;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        List<Integer> ans = new ArrayList<>();
        boolean[][] seen = new boolean[row][col];


        int[] dr = { 0 , 1 , 0 , -1};
        int[] dc = {1, 0 , -1, 0};
        int r=0, c=0, di=0;

        for (int i = 0; i < row*col; i++) {
              ans.add(matrix[r][c]);
              seen[r][c] = true;
              int cr = r + dr[di];
              int cc = c + dc[di];
              if(0<=cr && 0<=cc && cr<row && cc<col && !seen[cr][cc])
              {
                  r = cr;
                  c= cc;
              }else{
                  di = (di +1)% 4;
                  r += dr[di];
                  c += dc[di];
              }
        }
        return ans;

    }
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Solution sol = new Solution();
        System.out.println(sol.spiralOrder(matrix));
    }
}