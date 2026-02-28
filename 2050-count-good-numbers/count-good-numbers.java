class Solution {
    long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = n-odd;
        long temp1 = (power(5,even))%MOD;
        long temp2 = (power(4,odd))%MOD;
        long ans = (temp1*temp2)%MOD;
        return (int) ans;
    }

    public long power(long x,long n){
        long ans=1;
        x = x%MOD;
        while(n>0){
            if(n%2==1){
                ans = (ans*x)%MOD;
                n=n-1;
            }else{
                x = (x*x)%MOD;
                n = n/2;
            }
        }
        return ans;

    }
}