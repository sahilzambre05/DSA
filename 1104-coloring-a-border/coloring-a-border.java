class Solution {
    boolean[][] visited;
    int[][] direction = {{-1,0},{0,-1},{1,0},{0,1}};
    ArrayList<int[]> border = new ArrayList<>();
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int m = grid.length;
        int n = grid[0].length;
        visited = new boolean[m][n];
        int orgColor = grid[row][col]; 
        dfs(grid,row,col,orgColor);

        for(int[] b : border){
            grid[b[0]][b[1]] = color;
        }
        return grid;


    }

    public void dfs(int[][] grid,int row,int col,int orgColor){
        visited[row][col] = true;
        boolean isBorder = false;

        for(int[] dir : direction){
            int nr = row + dir[0];
            int nc = col + dir[1];

            if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length){
                isBorder = true;
            }else if(grid[nr][nc]!=orgColor){
                isBorder = true;
            }else if(!visited[nr][nc]){
                dfs(grid,nr,nc,orgColor);
            }
        }

        if(isBorder){
            border.add(new int[]{row,col});
        }
    }
}