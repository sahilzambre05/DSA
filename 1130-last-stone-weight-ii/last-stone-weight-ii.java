class Solution {
    Integer[][] dp;
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum=0;

        
        for(int stone : stones){
            sum+=stone;
        }

        dp = new Integer[n+1][sum/2+1];
        int ans = recur(stones,0,sum/2);


        return sum-2*ans;
    }

    public int recur(int[] stones,int index,int target){
        if(index==stones.length){
            dp[index][target]=0;
            return 0;
        }

        if(dp[index][target]!=null){
            return dp[index][target];
        }

        int nopick = recur(stones,index+1,target);
        int pick=0;
        if(stones[index]<=target){
            pick = stones[index] + recur(stones,index+1,target-stones[index]);
        }

        return dp[index][target] = Math.max(pick,nopick);
    }
}