class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        int leftMax[] = new int[n];
        int left=nums[0];
        int right=nums[n-1];
        int rightMax[] = new int[n];

        for(int i=0;i<n;i++){
            leftMax[i] = left;
            if(left<nums[i]){
                left = nums[i];
            }
        }
        for(int i=n-1;i>=0;i--){
            rightMax[i]  = right;
            if(right<nums[i]){
                right = nums[i];
            }
            
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i==0 || i==n-1 || nums[i]>leftMax[i] || nums[i]>rightMax[i]){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}