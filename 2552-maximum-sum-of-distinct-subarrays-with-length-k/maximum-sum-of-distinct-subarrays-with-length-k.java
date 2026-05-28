class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long maxSum = 0, curSum=0;
        for(int i=0;i<nums.length;i++){
            curSum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(i>=k-1){
                if(map.size()==k) maxSum = Math.max(maxSum,curSum);
                curSum-=nums[i-k+1];
                map.put(nums[i-k+1],map.get(nums[i-k+1])-1);
                if(map.get(nums[i-k+1])==0) map.remove(nums[i-k+1]);
            }

        }
        return maxSum;
    }
}