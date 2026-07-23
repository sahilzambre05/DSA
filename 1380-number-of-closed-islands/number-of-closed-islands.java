class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0 && dfs(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean dfs(int[][] grid,int i,int j){
        int m = grid.length;
        int n = grid[0].length;
        if(i<0 || j<0 || i>m-1 || j>n-1){
            return false;
        }
        if(grid[i][j]==1) return true;
        grid[i][j] = 1;
        boolean bottom = dfs(grid,i+1,j); 
        boolean left = dfs(grid,i,j-1);
        boolean right = dfs(grid,i,j+1);
        boolean top = dfs(grid,i-1,j);

        return bottom & left & right & top;
    }
}