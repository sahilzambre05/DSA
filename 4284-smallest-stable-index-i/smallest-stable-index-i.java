class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // int score=0;
        for(int i=0;i<nums.length;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                max = Math.max(max,nums[j]);
            }
            for(int x=i;x<nums.length;x++){
                min = Math.min(min,nums[x]);
            }
            
            int score=max-min;
            if(score<=k){
                return i;
            }
        }
        return -1;
        
    }
}