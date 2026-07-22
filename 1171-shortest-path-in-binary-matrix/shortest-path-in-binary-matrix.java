class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        // int n = grid[0].length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1){
            return -1;
        }
        int[][] direction = {{-1,-1},{0,-1},{1,-1},{1,0},{1,1},{0,1},{-1,1},{-1,0}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0,1});
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        while(!queue.isEmpty()){
            int node[] = queue.poll();
            int row = node[0];
            int col = node[1];
            int dist = node[2];

            if(row==n-1 && col==n-1){
                return dist;
            }

            for(int[] dir : direction){
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if(newRow>=0 && newCol>=0 && newRow<=n-1 && newCol<=n-1 && grid[newRow][newCol]==0 && !visited[newRow][newCol]){
                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{newRow,newCol,dist+1});
                }
            }
        }
        return -1;
    }
}