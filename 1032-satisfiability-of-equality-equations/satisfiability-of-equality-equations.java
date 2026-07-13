class Solution {
    public boolean equationsPossible(String[] equations) {
        DisjointSet dsu = new DisjointSet(26);
        ArrayList<int[]> notEqual = new ArrayList<>();
        for(String equation : equations){
            int n1 = equation.charAt(0) - 'a';
            int n2 = equation.charAt(3) - 'a';
            if(equation.charAt(1)=='='){
                dsu.unionBySize(n1,n2);
            }else{
                notEqual.add(new int[]{n1,n2});
            }
        }
        for(int arr[] : notEqual){
            if(dsu.findParent(arr[0])==dsu.findParent(arr[1])) return false;
        }
        return true;
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