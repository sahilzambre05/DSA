class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int k=0;
        int[] res = new int[nums.length];
        while(j!=nums.length){
            res[k++] = nums[i++];
            res[k++] = nums[j++];
        }
        return res;
    }
}