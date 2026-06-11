class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long sum = 0;
        for(int num : nums){
            sum+=num;
        }
        long prod = 1;
        for(int i=nums.length-1;i>=0;i--){
            sum-=nums[i];

            if(prod==sum){
                return i;
            }
            if(prod>sum/nums[i]) break;

            prod*=nums[i];
        }
        return -1;
    }
}