class Solution {
    public long minOperations(int[] nums) {
        long ans=0;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]>nums[i+1])
            ans+= nums[i]-nums[i+1];
        }
        return ans;
    }
}