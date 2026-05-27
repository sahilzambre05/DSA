class Solution {
    public int smallestEvenMultiple(int n) {
        int i=2;
        while(i!=1){
            if(i%n==0 && i%2==0){
                return i;
            }
            i++;
        }
        return -1;
    }
}