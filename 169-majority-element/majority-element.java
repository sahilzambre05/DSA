class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        int maxFreq = -1;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>maxFreq){
                maxFreq = map.get(num);
                ans = num;
            }
        }
        return ans;
    }
}