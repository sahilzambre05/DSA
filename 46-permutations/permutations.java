class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solve(nums,current,res);
        return res;
    }

    public void solve(int[] nums,List<Integer> current,List<List<Integer>> res){
        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])) continue;
            current.add(nums[i]);
            solve(nums,current,res);
            current.remove(current.size()-1);
        }
    }
}