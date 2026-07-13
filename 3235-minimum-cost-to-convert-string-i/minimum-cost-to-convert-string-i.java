class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int[][] path = new int[26][26];
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                path[i][j] = Integer.MAX_VALUE;
                path[i][i] = 0;
            }
        }

        for(int i=0;i<cost.length;i++){
            int u = original[i] - 'a';
            int v = changed[i] - 'a';
            int w = cost[i];
            if(path[u][v]>w){
                path[u][v] = w;
            }
        }

        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                if(path[i][k]<Integer.MAX_VALUE){
                    for(int j=0;j<26;j++){
                        if(path[k][j]<Integer.MAX_VALUE){
                            path[i][j] = Math.min(path[i][j],path[i][k]+path[k][j]);
                        }

                    }

                }
            }
        }

        long result = 0;
        for(int i=0;i<source.length();i++){
            int s = source.charAt(i) - 'a';
            int e = target.charAt(i) - 'a';
            if(path[s][e]==Integer.MAX_VALUE) return -1;
            result+=path[s][e];
        }
        return result;


    }
}