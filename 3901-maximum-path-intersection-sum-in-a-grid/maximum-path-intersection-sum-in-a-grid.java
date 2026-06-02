class Solution {
    public int maxScore(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                ans = Math.max(ans,grid[i][j]);
            }
        }

        for(int i=0;i<n;i++){
            int sum = grid[i][0];
            int best = Integer.MIN_VALUE;
            for(int j=1;j<m;j++){
                best = Math.max(best,sum+grid[i][j]);
                sum = Math.max(grid[i][j],sum+grid[i][j]);
            }
            ans = Math.max(ans,best);
        }

        for(int j=0;j<m;j++){
            int sum = grid[0][j];
            int best = Integer.MIN_VALUE;
            for(int i=1;i<n;i++){
                best = Math.max(best,sum+grid[i][j]);
                sum = Math.max(grid[i][j],sum+grid[i][j]);
            }
            ans = Math.max(ans,best);
        }
        return ans;
    }
}