class Solution {
    public int minCost(int n) {
        if(n==1) return 0;

        int dp[] = new int[n+1];

        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            dp[i] = (i-1)+dp[i-1];
        }
        return dp[n];
    }
}