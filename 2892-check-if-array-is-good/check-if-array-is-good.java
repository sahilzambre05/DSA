class Solution {
    public boolean isGood(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        Arrays.sort(nums);
        if(nums.length!=max+1){
            return false;
        }
        for(int i=0;i<max;i++){
            if(nums[i]!=i+1){
                    return false;
            }
        }

        if(nums[max]==max){
            return true;
        }else{
            return false;
        }
        
    }
}