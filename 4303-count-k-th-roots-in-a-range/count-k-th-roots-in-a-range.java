class Solution {
    public int countKthRoots(int l, int r, int k) {
        if(k==1){
            return r-l+1;
        }

        int cnt=0;
        long x=0;

        while(true){
            int val =(int) Math.pow(x,k);
            if(val>r){
                break;
            }
            if(val>=l){
                cnt++;
            }
            x++;

        }
        return cnt;
    }
}