class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            // if(!map.contains(n)){
                map.put(n,map.getOrDefault(n,0)+1);
            // }
        }

        for(int a : map.values()){
            if(a>=2){
                return true;
            }
        }
        return false;
    }
}