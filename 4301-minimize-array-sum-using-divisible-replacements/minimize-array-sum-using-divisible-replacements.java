class Solution {
    public long minArraySum(int[] nums) {
        int MAX = 100001;
        boolean[] present = new boolean[MAX];
        for(int n:nums){
            present[n] = true;
        }

        long ans=0;
        for(int x : nums){
            int best = x;
            for(int d=1;d*d<=x;d++){
                if(x%d==0){
                    if(present[d]){
                        best = Math.min(best,d);
                    }
                    int other = x/d;
                    if(present[other]){
                        best = Math.min(best,other);
                    }
                }
            }
            ans+=best;
        }
        return ans;
    }
}