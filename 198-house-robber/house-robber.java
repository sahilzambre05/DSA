class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int ans = recur(nums,nums.length-1,dp);
        return ans;
    }

    public int recur(int[] nums,int i,int[] dp){
        if(i==0){
            return nums[i];
        }

        if(i==-1){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }

        int p = nums[i] + recur(nums,i-2,dp);
        int np = recur(nums,i-1,dp);
        dp[i] = Math.max(p,np);

        return dp[i];
        
    }
}