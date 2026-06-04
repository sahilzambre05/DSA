class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] res = new int[nums.length];
        int even=0;
        int odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                res[i]=even;
                odd--;
            }else{
                res[i] = odd;
                even--;
            }
        }

        return res;

        
    }
}