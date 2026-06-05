class Solution {
    public int compareBitonicSums(int[] nums) {
        int max = 0;
        int idx=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
                idx=i;
            }
        }
        long sumA = 0;
        for(int i=0;i<=idx;i++){
            sumA+=nums[i];
        }
        long sumD=0;
        for(int i=idx;i<nums.length;i++){
            sumD+=nums[i];
        }
        if(sumA>sumD){
            return 0;
        }else if(sumA<sumD){
            return 1;

        }
        return -1;
    }
}