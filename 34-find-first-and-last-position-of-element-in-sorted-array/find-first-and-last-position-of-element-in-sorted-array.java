class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int left = findFirst(nums,target);
        int right = findLast(nums,target);

        return new int[]{left,right};
        
    }

    public int findFirst(int[] nums,int target){
        int index=-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                index = mid;
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return index;
    }
    public int findLast(int[] nums,int target){
        int index=-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                index = mid;
                start = mid+1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return index;
    }
}