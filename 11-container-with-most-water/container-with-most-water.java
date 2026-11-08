class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int max = 0;
        int right = height.length-1;
        while(left<=right){
            int width = right-left;
            int len = Math.min(height[left],height[right]);
            max = Math.max(max,width*len);
            System.out.println(max);
            if(len==height[left]){
                left++;
            }else{
                right--;
            }

        }
        return max;
    }
}