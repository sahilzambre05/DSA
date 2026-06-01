class Solution {
    public int longestOnes(int[] nums, int k) {
        // int one=0;
        int zero=0;
        int left=0;
        int maxSize=0;
        // int maxFreq=0;
        int n = nums.length;
        for(int right=0;right<n;right++){
            if(nums[right]==0) zero++;
            // else one++;
            // maxFreq = Math.max(maxFreq,zero);
            int windowLength = right-left+1;
        
            if(zero>k){
                if(nums[left]==0) zero--;
                // else one--;
                left++;
            }
            windowLength = right-left+1;
            maxSize = Math.max(maxSize,windowLength);
        }
        return maxSize;
    }
}