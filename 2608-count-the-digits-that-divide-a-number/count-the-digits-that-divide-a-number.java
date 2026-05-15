class Solution {
    public int countDigits(int num) {
        int t = num;
        int cnt=0;
        while(t>0){
            int mod = t%10;
            if(num%mod==0){
                cnt++;
            }
            t = t/10;
        }
        return cnt;
    }
}