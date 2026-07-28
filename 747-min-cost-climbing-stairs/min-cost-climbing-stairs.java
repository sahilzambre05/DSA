class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(n,cost,dp);
    }

    public int recur(int n,int[] cost,int[] dp){
        if(n<2){
            dp[n]=0;
            return 0;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n] = Math.min((cost[n-1]+recur(n-1,cost,dp)),(cost[n-2]+recur(n-2,cost,dp)));
        return dp[n];

    }
}