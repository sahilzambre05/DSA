class Solution {
    public int makeConnected(int n, int[][] connections) {
        DisjointSet dsu = new DisjointSet(n);
        int wire=0;
        if(connections.length<n-1){
            return -1;
        }
        for(int connection[] : connections){
            int u = connection[0];
            int v = connection[1];
            if(dsu.unionBySize(u,v)){
                wire++;
            }
        }
        return n-1-wire;
    }
}

class DisjointSet{
    int parent[];
    int size[];
    DisjointSet(int node){
        this.parent = new int[node];
        this.size = new int[node];
        for(int i=0;i<node;i++){
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int findParent(int node){
        if(node == parent[node]) return node;
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