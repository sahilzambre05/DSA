class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer,Integer> freqCount = new HashMap<>();
        for(int v : freq.values()){
            freqCount.put(v,freqCount.getOrDefault(v,0)+1);
            
        }

        for(int num : nums){
            if(freqCount.get(freq.get(num))==1) return num;
            
        }

        return -1;

    }
}