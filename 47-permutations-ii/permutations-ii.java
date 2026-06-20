class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];
        solve(nums,seen,current,res);
        return res;
    }

    public void solve(int[] nums,boolean[] seen ,List<Integer> current,List<List<Integer>> res){
        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(seen[i]) continue;

            if(i>0 && nums[i]==nums[i-1] && !seen[i-1]) continue;
            seen[i] = true;
            current.add(nums[i]);
            solve(nums,seen,current,res);
            current.remove(current.size()-1);
            seen[i] = false;
        }
    }
}