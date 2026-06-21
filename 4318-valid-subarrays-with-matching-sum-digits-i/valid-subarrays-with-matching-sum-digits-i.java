class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                String s = String.valueOf(sum);
                char a = (char)(x+'0');
                if(s.charAt(0)==a && s.charAt(s.length()-1)==a){
                    cnt++;
                }
            }
        }
        return cnt;
        
    }
}