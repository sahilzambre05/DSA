class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2){
            int a = nums[i];
            int b = nums[i+1];
            res[i] = b;
            res[i+1] = a;
        }
        return res;
    }
}