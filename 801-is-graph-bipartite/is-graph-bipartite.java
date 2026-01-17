class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int colour[] = new int[n];
        Arrays.fill(colour,-1);
        for(int i=0;i<n;i++){
            if(colour[i]==-1){
                if(!color(i,graph,colour)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean color(int src,int[][] graph,int[] colour){
        Queue<Integer> queue = new LinkedList<>();
        colour[src]=0;
        queue.offer(src);
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int neighbour : graph[node]){
                if(colour[neighbour]==-1){
                    colour[neighbour] = 1-colour[node];
                    queue.offer(neighbour);
                }else if(colour[neighbour]==colour[node]){
                    return false;

                }
            }
        }
        return true;
    }
}