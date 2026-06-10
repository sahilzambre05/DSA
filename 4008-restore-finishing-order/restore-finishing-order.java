class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int friend : friends){
            set.add(friend);
        }
        List<Integer> list = new ArrayList<>();
        for(int o : order){
            if(set.contains(o)){
                list.add(o);
            }
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}