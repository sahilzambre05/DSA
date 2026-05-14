class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[(nums.length-k+i)%nums.length];
        }
        int j=0;
        for(int n : arr){
            nums[j++] = n;
        }
    }
}