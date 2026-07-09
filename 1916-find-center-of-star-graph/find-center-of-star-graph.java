class Solution {
    public int findCenter(int[][] edges) {
        int degree[] = new int[edges.length+1];
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            degree[u-1]++;
            degree[v-1]++;
            
        }

        int max = 0;
        int idx = -1;

        for(int i=0;i<degree.length;i++){
            if(degree[i]>max){
                max = degree[i];
                idx = i;
            }
        }

        return idx+1;
    }
}