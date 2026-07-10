class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    freshCount++;
                }else if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        int time = 0;
        if(freshCount ==0 ){
            return 0;
        }

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int node[] = queue.poll();
                int r = node[0];
                int c = node[1];
                int neighbour[][] = {{r-1,c},{r+1,c},{r,c-1},{r,c+1}};
                for(int neigh[] : neighbour){
                    int nr = neigh[0];
                    int nc = neigh[1];
                    if(nr<0 || nc<0 || nr>=m || nc>=n || grid[nr][nc]==2 || grid[nr][nc]==0){
                        continue;
                    }
                    queue.offer(new int[]{nr,nc});
                    grid[nr][nc] = 2;
                    freshCount--;
                    if(freshCount==0){
                        return time+1;
                    }
                }
            }
            time++;
        }
        return -1;
    }
}