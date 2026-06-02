class Solution {
    public int minimumSwaps(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int cnt=0;
        while(i<j){
            if(nums[i]==0 && nums[j]!=0){
                swap(nums,i,j);
                cnt++;
                j--;
                i++;
            }else if(nums[i]!=0 && nums[j]==0){
                j--;
            }else if(nums[i]==0 && nums[j]==0){
                j--;
            }else if(nums[i]!=0 && nums[j]!=0){
                i++;
            }
        }
        return cnt;
    }
    public void swap(int[] nums,int i1,int i2){
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}