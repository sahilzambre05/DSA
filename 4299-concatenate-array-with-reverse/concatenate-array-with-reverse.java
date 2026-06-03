class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int res[] = new int[2*n];
        for(int i=0;i<n;i++){
            res[i] = nums[i];
            res[i+n] = nums[n-i-1];
        }
        return res;
    }
}