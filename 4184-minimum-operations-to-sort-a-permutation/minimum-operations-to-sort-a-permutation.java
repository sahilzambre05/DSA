class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int pos=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                pos=i;
                break;
            }
        }
        boolean ok = true;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=(i-pos+n)%n){
                ok = false;
                break;
            }
        }

        if(ok){
            int k = pos;
            ans = Math.min(ans,Math.min(k,n-k+2));
        }

        ok = true;
        for(int i=0;i<n;i++){
            int expected = (pos-i+n)%n;
            if(nums[i]!=expected){
                ok = false;
                break;
            }

        }

        if(ok){
            int k = (n-1-pos+n)%n;
            ans = Math.min(ans,1+Math.min(k,n-k));

        }
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}