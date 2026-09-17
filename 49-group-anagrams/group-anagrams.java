class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
                map.get(s).add(str);
            }else{
                map.get(s).add(str);
            }

        }
        List<List<String>> ans = new ArrayList<>();

        for(List<String> list : map.values()){
            ans.add(list);
        }
        return ans;
    }
}