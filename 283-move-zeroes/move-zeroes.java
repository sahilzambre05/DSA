class Solution {
    public void moveZeroes(int[] nums) {
        int zero=0;
        int nonzero=0;
        int n = nums.length;
        while(nonzero<n){
            if(nums[nonzero]!=0){
                swap(nums,zero,nonzero);
            }
            nonzero++;
            if(nums[zero]!=0){
                zero++;
            }

        }

    }

    public void swap(int[] nums,int i1,int i2){
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}