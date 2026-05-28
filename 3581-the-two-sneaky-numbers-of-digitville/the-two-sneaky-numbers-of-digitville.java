class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int k=0;
        int res[] = new int[2];

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==2){
                res[k++] = nums[i];
                map.put(nums[i],0);
            }
        }
        return res;
    }
}