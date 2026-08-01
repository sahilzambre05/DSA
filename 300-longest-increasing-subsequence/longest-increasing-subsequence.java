class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=1;i<n;i++){
            for(int p=0;p<i;p++){
                if(nums[p]<nums[i]){
                    dp[i] = Math.max(dp[i],1+dp[p]);
                    max = Math.max(max,dp[i]);

                }
            }
                // System.out.print(dp[i]+" ");
        }
        return max;
    }
}