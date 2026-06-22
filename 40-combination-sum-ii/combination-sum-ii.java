class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(candidates,curr,res,target,0);
        return res;

        
    }

    public void solve(int[] candidates,List<Integer> curr,List<List<Integer>> res,int target,int idx){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(idx==candidates.length){
            return;
        }

        for(int i=idx;i<candidates.length;i++){
            if((i==idx || candidates[i]!=candidates[i-1]) && candidates[i]<=target){
                curr.add(candidates[i]);
                solve(candidates,curr,res,target-candidates[i],i+1);
                curr.remove(curr.size()-1);
            }
        }


    }
}