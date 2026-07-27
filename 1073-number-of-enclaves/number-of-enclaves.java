class Solution {
    boolean[][] visited;
    int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            if(grid[i][0]==1 && !visited[i][0]) dfs(grid,i,0);
            if(grid[i][n-1]==1 && !visited[i][n-1]) dfs(grid,i,n-1);
        }

        for(int i=0;i<n;i++){
            if(grid[0][i]==1 && !visited[0][i]) dfs(grid,0,i);
            if(grid[m-1][i]==1 && !visited[m-1][i]) dfs(grid,m-1,i);
        }

        int count=0;


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int[][] grid,int row,int col){
        int r = grid.length;
        int c = grid[0].length;
        if(row<0 || col<0 || row>=r || col>=c || visited[row][col] || grid[row][col]==0){
            return;
        }
        visited[row][col] = true;


        for(int dir[] : direction){
            int a = row + dir[0];
            int b = col + dir[1];
            dfs(grid,a,b);
        }
    }
}