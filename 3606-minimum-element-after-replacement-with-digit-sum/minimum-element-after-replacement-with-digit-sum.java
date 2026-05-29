class Solution {
    public int minElement(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int sum=0;
            while(a>0){
                int rem = a%10;
                sum+=rem;
                a/=10;
            }
            res[i] = sum;
        }
        Arrays.sort(res);
        return res[0];
    }
}