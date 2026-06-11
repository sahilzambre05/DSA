class Solution {
    public long gcdSum(int[] nums) {
        int mx = 0;
        int prefixGcd[] = new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=mx){
                mx = nums[i];
            }
            prefixGcd[i] = gcd(mx,nums[i]);
        }
        Arrays.sort(prefixGcd);
        long sum=0;

        for(int i=0;i<nums.length/2;i++){
            int a = gcd(prefixGcd[nums.length-i-1],prefixGcd[i]);
            sum+=a;
        }
        return sum;
    }

    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}