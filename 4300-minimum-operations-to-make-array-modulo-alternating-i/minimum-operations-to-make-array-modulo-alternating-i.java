class Solution {
    public int minOperations(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        if(k==1) return 0;

        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                if(i==j) continue;
                int sum=0;
                for(int p=0;p<nums.length;p++){
                    int rem = nums[p]%k;
                    if(p%2==0){
                        int cal = Math.abs(rem-i);
                        sum+=Math.min(cal,k-cal);
                    }else{
                        int cal = Math.abs(rem-j);
                        sum+=Math.min(cal,k-cal);

                    }
                }
                min = Math.min(min,sum);
            }
        }
        return min;
    }
}