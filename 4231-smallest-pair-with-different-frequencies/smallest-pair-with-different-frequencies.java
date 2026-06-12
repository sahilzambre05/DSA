class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        Arrays.fill(res,-1);
        int min=Integer.MAX_VALUE;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            min = Math.min(min,num);
        }

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int a = map.get(nums[i]);
            for(int j=i+1;j<nums.length;j++){
                int b = map.get(nums[j]);
                if(nums[i]!=nums[j] && a!=b){
                    res[0] = nums[i];
                    res[1] = nums[j];
                    return res;
                }
            }
        }
        return  res;

    }
}