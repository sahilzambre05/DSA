class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int min = Integer.MAX_VALUE;
        int right = 0;
        int sum=0;
        while(right<nums.length){
                sum+=nums[right];
                right++;
            while(sum>=target){
                min = Math.min(min,right-left);
                System.out.println(min+""+sum );
                sum-=nums[left];
                left++;
            }
            
            

        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}