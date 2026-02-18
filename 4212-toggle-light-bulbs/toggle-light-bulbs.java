class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<bulbs.size();i++){
            map.put(bulbs.get(i),map.getOrDefault(bulbs.get(i),0)+1);
        }

        for(int key : map.keySet()){
            int val = map.get(key);
            if(val%2!=0){
                ans.add(key);

            }
        }

        Collections.sort(ans);
        return ans;
    }
}