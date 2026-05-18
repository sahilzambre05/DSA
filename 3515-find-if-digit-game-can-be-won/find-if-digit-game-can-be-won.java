class Solution {
    public boolean canAliceWin(int[] nums) {
        int t=0,o=0;
        for(int n : nums){
            if(n>=10){
                t+=n;
            }else{
                o+=n;
            }
        }
        if(t==o){
            return false;
        }
        return true;
    }
}