class Solution {
    int rows;
    int cols;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        rows = image.length;
        cols = image[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int curColor = image[sr][sc];
        image[sr][sc] = color;
        queue.offer(new int[]{sr,sc});
        while(!queue.isEmpty()){
            int node[] = queue.poll();
            int row = node[0];
            int col = node[1];
            int adjList[][] = {{row-1,col},{row+1,col},{row,col-1},{row,col+1}};
            for(int neighbour[] : adjList){
                int r = neighbour[0];
                int c = neighbour[1];
                if(r<0 || r>=rows || c<0 || c>=cols || image[r][c]==color || image[r][c]!=curColor){
                    continue;
                }
                image[r][c] = color;
                queue.offer(new int[]{r,c});
            }
        }
        return image;
    }
}