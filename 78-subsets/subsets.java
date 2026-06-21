class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(nums,res,curr,0);
        return res;
    }

    public void solve(int[] nums,List<List<Integer>> res,List<Integer> curr,int start){

        // if(res.contains(curr)) return;
        res.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            solve(nums,res,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}