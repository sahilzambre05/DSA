class Solution {
    public int maxProduct(int[] nums) {
        int maxP=nums[0];
        int minP=nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            int curr = nums[i];

            int tempMax = Math.max(curr, Math.max(maxP * curr, minP * curr));
            int tempMin = Math.min(curr, Math.min(maxP * curr, minP * curr));

            maxP = tempMax;
            minP = tempMin;

            ans = Math.max(ans, maxP);
        }
        return ans;
        
    }
}