class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] res = new int[2];
        DisjointSet dsu = new DisjointSet(n);
        for(int edge[] : edges){
            if(!dsu.unionBySize(edge[0]-1,edge[1]-1)) return edge;
        }
        return res;
    }
}

public class DisjointSet{
    int parent[];
    int size[];
    DisjointSet(int node){
        this.parent = new int[node];
        this.size = new int[node];
        for(int i=0;i<node;i++){
            this.parent[i] = i;
            this.size[i] = 1;
        }
    }

    public int findParent(int node){
        if(node==parent[node]){
            return node;
        }
        parent[node] = findParent(parent[node]);
        return parent[node];
    }

    public boolean unionBySize(int node1,int node2){
        int nodeParent1 = findParent(node1);
        int nodeParent2 = findParent(node2);
        if(nodeParent1==nodeParent2) return false;
        if(size[nodeParent1]<size[nodeParent2]){
            parent[nodeParent2] = nodeParent1;
            size[nodeParent2] += size[nodeParent1];
        }else{
            parent[nodeParent1] = nodeParent2;
            size[nodeParent1] += size[nodeParent2];
        }
        return true;

    }
}