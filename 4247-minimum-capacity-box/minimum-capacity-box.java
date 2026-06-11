class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min=Integer.MAX_VALUE;
        int idx=0;
        int i=0;
        for(;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                if(capacity[i]<min){
                    min = Math.min(min,capacity[i]);
                    idx = i;

                }
            }
        }
        return (min==Integer.MAX_VALUE)?-1:idx;
    }
}