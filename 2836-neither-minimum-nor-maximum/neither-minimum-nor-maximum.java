class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=0;
        int min=101;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];

        }

        for(int n : nums){
            if(n!=max && n!=min){
                return n;
            }
        }

        return -1;
        

        
    }
}