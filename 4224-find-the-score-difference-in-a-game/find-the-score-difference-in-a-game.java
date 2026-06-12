class Solution {
    public int scoreDifference(int[] nums) {
        boolean first = true;
        boolean second = false;
        int f=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                first=!first;
                second=!second;
            }
            if((i+1)%6==0){
                first=!first;
                second=!second;
            }

            

            if(first){
                f+=nums[i];

            }else{
                s+=nums[i];
            }


        }

        return f-s;
        
    }
}