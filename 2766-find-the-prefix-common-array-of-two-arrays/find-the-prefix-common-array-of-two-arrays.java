class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int[] res = new int[A.length];
        int count = 0;
        for(int i=0;i<A.length;i++){
            setA.add(A[i]);
            setB.add(B[i]);
            if(A[i]==B[i]){
                count++;
            }else{
                if(setA.contains(B[i])){
                    count++;
                }
                if(setB.contains(A[i])){
                    count++;
                }
            }
            res[i] = count;
        
        }
        return res;
    }
}