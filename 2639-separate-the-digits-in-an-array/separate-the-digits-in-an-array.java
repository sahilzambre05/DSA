class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int val : nums){
            List<Integer> curr = new ArrayList<>();
            while(val>0){
                curr.add(val%10);
                val=val/10;
            }
            Collections.reverse(curr);
            list.addAll(curr);
        }
        int result[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
            
        }
        return result;
    }
}