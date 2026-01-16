class Solution {
    public boolean equationsPossible(String[] equations) {
        DisjointSet dsu = new DisjointSet(26);
        ArrayList<int[]> notEqual = new ArrayList<>();
        for(String equation : equations){
            int u = equation.charAt(0)-'a';
            int v = equation.charAt(3)-'a';
            if(equation.charAt(1)=='='){
                dsu.unionBySize(u,v);
            }else{
                notEqual.add(new int[]{u,v});
            }
        }
        for(int edge[] : notEqual){
            if(dsu.findRootParent(edge[0])==dsu.findRootParent(edge[1])){
                return false;
            }
        }
        return true;
        
    }
}


class DisjointSet{
    int[] parent;
    int[] size;

    DisjointSet(int node){
        this.parent = new int[node];
        this.size = new int[node];
        for(int i=0;i<node;i++){
            parent[i]=i;
            size[i]=1;
        }
    }


    public int findRootParent(int node){
        if(node==parent[node]){
            return node;
        }
        parent[node] = findRootParent(parent[node]);
        return parent[node];
    }

    public boolean unionBySize(int node1,int node2){
        int rootParent1 = findRootParent(node1);
        int rootParent2 = findRootParent(node2);

        if(rootParent1==rootParent2){
            return false;
        }

        if(size[rootParent1]<size[rootParent2]){
            parent[rootParent1]=rootParent2;
            size[rootParent2]+=size[rootParent1];
        }else{
            parent[rootParent2]=rootParent1;
            size[rootParent1]+=size[rootParent2];

        }
        return true;
    }
}