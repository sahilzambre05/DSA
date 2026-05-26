class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for(int i=0;i<k;i++){
            max+=nums[i];
        }
        int ans=max;
        for(int i=k;i<nums.length;i++){
            max+=nums[i];
            max-=nums[i-k];
            ans = Math.max(max,ans);
        }
        return (double) ans/k;
    }
}