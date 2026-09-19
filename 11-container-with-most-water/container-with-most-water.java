class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int maxArea=0;
        while(left<right){
            int min = Math.min(height[left],height[right]);
            int wid = right-left;
            maxArea = Math.max(maxArea,min*wid);
            if(min==height[left]) left++;
            if(min==height[right]) right--;

        }
        return maxArea;
    }
}