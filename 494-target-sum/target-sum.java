class Solution {
    int cnt;
    public int findTargetSumWays(int[] nums, int target) {
        // cnt=0;
        
        return recur(nums,target,0,nums.length-1);
    }

    public int recur(int[] nums,int target,int sum,int index){
        
        if(index<0){
            if(sum==target){
                return 1;
            }
            return 0;
        }

        int plus = recur(nums,target,sum+nums[index],index-1);
        int minus = recur(nums,target,sum-nums[index],index-1);

        

        return plus+minus;
    
    }
}