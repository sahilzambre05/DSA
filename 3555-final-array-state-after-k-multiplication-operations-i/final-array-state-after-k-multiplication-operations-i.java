class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0){
            int min=nums[0];
            int idx=0;
            for(int i=0;i<nums.length;i++){
                if(min>nums[i]){
                    min = nums[i];
                    idx=i;
                }
            }
            nums[idx] = min*multiplier;
            k--;

        }
        return nums;
    }
}