class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int cnt=0;
        int temp=0;
        temp = nums[0];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]==temp){
                cnt++;
            }else{
                temp = nums[i];
                cnt=1;
            }
            if(cnt<=k){
                res.add(temp);
            }
        }

        int[] ans = new int[res.size()];
        for(int a : res){
            ans[j++] = a;
        }

        return ans;
    }
}