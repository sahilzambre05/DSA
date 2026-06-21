class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(candidates,curr,res,0,target);
        return res;
    }

    public void solve(int[] candidates,List<Integer> curr,List<List<Integer>> res,int index,int target){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(index==candidates.length){
            return;
        }

        if(candidates[index]<=target){
            curr.add(candidates[index]);
            solve(candidates,curr,res,index,target - candidates[index]);
            curr.remove(curr.size()-1);
        }

        solve(candidates,curr,res,index+1,target);
        
    }
}