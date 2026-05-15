class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }else{
                product = product*nums[i];
            }
        }
        if(zeroCount>1){
            return res;
        }

        for(int i=0;i<nums.length;i++){
            if(zeroCount!=0){
                if(nums[i]==0){
                    res[i] = product;
                }else{
                    res[i] = 0;
                }
            }else{
                res[i] = product/nums[i];
            }
        }
        return res;
    }
}