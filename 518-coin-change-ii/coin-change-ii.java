class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = recur(coins,amount,n-1,dp);
        return ans;
    }

    public int recur(int[] coins,int amount, int index,int[][] dp){
        if(index==0){
            if(amount%coins[index]==0){
                dp[index][amount] = 1;
                return 1;
            }
            dp[index][amount] = 0;
            return 0;
        }

        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }

        int pick  = 0;
        if(amount>=coins[index]){
            pick = recur(coins,amount-coins[index],index,dp);
        }

        int nopick = recur(coins,amount,index-1,dp);
        dp[index][amount] = pick+nopick;
        return dp[index][amount];
    }
}