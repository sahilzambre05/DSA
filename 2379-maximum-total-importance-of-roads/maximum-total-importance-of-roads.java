class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long degree[] = new long[n];
        for(int road[] : roads){
            int u = road[0];
            int v = road[1];
            degree[u]++;
            degree[v]++;
        }
        Arrays.sort(degree);
        long result = 0;
        for(int i=1;i<=n;i++){
            result+=i*degree[i-1];
        }
        return result;
    }
}