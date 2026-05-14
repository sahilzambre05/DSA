class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // int i=0,j=0;
        long res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int j=i;
                while(j<nums.length && nums[j]==0){
                    j++;
                }
                long len = j-i;
                long ans = ((len)*(len+1))/2;
                res+=ans;
                i = j-1;
            }
        }
        return res;
    }
}