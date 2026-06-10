class Solution {
    public int gcdOfOddEvenSums(int n) {
        int t = n;
        int i=1;
        int sumOdd=0;
        while(t>0){
            sumOdd+=i;
            i+=2;
            t--;
        }
        int j=2;
        int sumEven=0;
        while(n>0){
            sumEven+=j;
            j+=2;
            n--;
        }
        int ans = gcd(sumOdd,sumEven);
        return ans;
    }

    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}