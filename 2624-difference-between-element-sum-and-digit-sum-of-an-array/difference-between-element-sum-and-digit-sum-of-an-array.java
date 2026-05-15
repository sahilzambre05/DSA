class Solution {
    public int differenceOfSum(int[] nums) {
        int e=0;
        int d=0;
        for(int i=0;i<nums.length;i++){
            e+=nums[i];
            if(nums[i]>=10){
                int t = nums[i];
                while(t>0){
                    int m = t%10;
                    d+=m;
                    t=t/10;
                }
            }else{
                d+=nums[i];
            }
        }
        return Math.abs(e-d);
    }
}