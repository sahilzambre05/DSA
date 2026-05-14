class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        long power = 1;
        while(power<n){
            power = power<<1;
        }
        if(power==n){
            return true;
        }
        return false;
        
        
    }
}