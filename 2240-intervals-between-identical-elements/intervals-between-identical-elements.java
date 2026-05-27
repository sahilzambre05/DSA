class Solution {
    public long[] getDistances(int[] nums) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        long[] res = new long[nums.length];

        for(List<Integer> list : map.values()){
            int n = list.size();

            long leftSum = 0l;
            long rightSum = 0l;

            for(int i=0;i<n;i++){
                rightSum+=list.get(i);
            }

            for(int i=0;i<n;i++){
                rightSum-=list.get(i);

                long currSum = 0l;

                currSum += ((long)list.get(i)*i - leftSum);

                currSum+= (rightSum - (n-i-1)*(long)list.get(i));

                leftSum += list.get(i);

                res[list.get(i)] = currSum;
            }
        }

        return res;
    }
}