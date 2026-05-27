class Solution {
    public int trap(int[] height) {
        int leftMax=0;
        int rightMax=0;
        int l=0;
        int r=height.length-1;
        int ans=0;
        while(l<r){
            if(leftMax<height[l]){
                leftMax=height[l];
            }
            if(rightMax<height[r]){
                rightMax=height[r];
            }
            if(leftMax<rightMax){
                ans+= leftMax - height[l];
                l++;
            }else{
                ans+= rightMax - height[r];
                r--;

            }
        }
        return ans;
    }
}