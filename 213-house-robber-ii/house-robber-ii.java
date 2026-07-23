class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int res = Math.max(rob1(nums,0,n-2),rob1(nums,1,n-1));
        return res;
        
    }

    public int rob1(int[] nums,int start,int end) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[start] = nums[start];
        for(int i=start+1;i<=end;i++){
            if(i==start+1){
                dp[i] = Math.max(nums[i],nums[i-1]);
            }else{
                dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);

            }

        }
        return dp[end];
    }
}