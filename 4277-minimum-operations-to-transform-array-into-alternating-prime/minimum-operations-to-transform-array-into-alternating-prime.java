class Solution {
    public int minOperations(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                while(isPrime(nums,i)==false){
                    nums[i] = nums[i]+1;
                    cnt++;
                }

            }
            if(i%2!=0){
                while(isPrime(nums,i)==true){
                    nums[i] = nums[i]+1;
                    cnt++;
                }

            }
        }
            return cnt;
    }

    public boolean isPrime(int[] nums,int i){
        int n = nums[i];
        if(n<2){
            return false;
        }
        for(int j=2;j*j<=n;j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
}