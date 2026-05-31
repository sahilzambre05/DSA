class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max=0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,Math.abs(nums[i%n] - nums[(i+1)%n]));
        }
        return max;
        
    }
}