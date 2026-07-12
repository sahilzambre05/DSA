class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n+1];
        Arrays.fill(dist,(int)1e8);
        dist[k] = 0;
        for(int i=1;i<=n-1;i++){
            for(int time[] : times){
                int u = time[0];
                int v = time[1];
                int w = time[2];
                if(dist[u]!=(int)1e8 && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                }
            }
        }

        for(int time[] : times){
            int u = time[0];
            int v = time[1];
            int w = time[2];
            if(dist[u]!=(int)1e8 && dist[u] + w < dist[v]){
                // dist[v] = dist[u] + w;
                return -1;
            }
        }

        int result = 0;
        for(int i=1;i<=n;i++){
            if(dist[i]==(int)1e8){
                return -1;
            }
                result = Math.max(result,dist[i]);
        }
        return result;





    }
}