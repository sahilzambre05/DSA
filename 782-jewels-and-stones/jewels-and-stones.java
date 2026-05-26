class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char a : stones.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int count=0;

        for(int i=0;i<jewels.length();i++){
            char b = jewels.charAt(i);
            if(map.containsKey(b)){
                count+=map.get(b);
            }
        }
        return count;
    }
}