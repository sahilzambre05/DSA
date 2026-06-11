class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : nums2){
            map.put(num,map.getOrDefault(num,0)-1);
        }

        int ans=0;

        for(int a : map.values()){
            if((Math.abs(a)&1)==1) return -1;
            ans+=Math.abs(a)/2;

        }
        return ans/2;
    }
}