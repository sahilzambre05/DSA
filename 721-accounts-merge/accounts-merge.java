class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(List<String> account : accounts){
            String firstEmail = account.get(1);
            for(int i=2;i<account.size();i++){
                String curEmail = account.get(i);
                if(!map.containsKey(firstEmail)){
                    map.put(firstEmail,new ArrayList<>());
                }
                map.get(firstEmail).add(curEmail);
                if(!map.containsKey(curEmail)){
                    map.put(curEmail,new ArrayList<>());
                }
                map.get(curEmail).add(firstEmail);
            }
        }
        List<List<String>> res = new ArrayList<>();
        HashSet<String> visited = new HashSet<>();
        for(List<String> account : accounts){
            String firstEmail = account.get(1);
            if(!visited.contains(firstEmail)){
                List<String> sublist = new ArrayList<>();
                dfs(firstEmail,visited,map,sublist);
                Collections.sort(sublist);
                sublist.add(0,account.get(0));
                res.add(sublist);
            }
        }
        return res;

    }

    public void dfs(String src, HashSet<String> visited, HashMap<String,List<String>> map,List<String> sublist ){
        visited.add(src);
        sublist.add(src);
        if(!map.containsKey(src)){
            return;
        }
        for(String neighbour : map.get(src)){
            if(!visited.contains(neighbour)){
                dfs(neighbour,visited,map,sublist);
            }
        }
    }
}