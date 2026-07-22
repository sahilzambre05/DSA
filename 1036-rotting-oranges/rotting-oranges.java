class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        int time=0;


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    freshCount++;
                }else if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        if(freshCount==0) return 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int node[] = queue.poll();
                int row = node[0];
                int col = node[1];
                int[][] direction = {{row+1,col},{row-1,col},{row,col+1},{row,col-1}};
                for(int[] dir : direction){
                    int nr = dir[0];
                    int nc = dir[1];
                    if(nr>=0 && nc>=0 && nr<=m-1 && nc<=n-1 && grid[nr][nc]==1){
                        grid[nr][nc] = 2;
                        freshCount--;
                        queue.offer(new int[]{nr,nc});
                    }
                }

            }
            time++;
        }
        if(freshCount!=0){
            return -1;
        }

        return time-1;
    }
}