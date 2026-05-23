class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<Character,Queue<String>> map = new HashMap<>();

        for(char a : s.toCharArray()){
            map.putIfAbsent(a,new LinkedList<>());
        }

        int count=0;

        for(int i=0;i<words.length;i++){
            char b = words[i].charAt(0);
            if(map.containsKey(b)){
                map.get(b).offer(words[i]);
            }
        }

        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            Queue<String> q = map.get(a);
            int size = q.size();
            for(int k=0;k<size;k++){
                String str = q.poll();
                if(str.substring(1).length()==0){
                    count++;
                }else{
                    if(map.containsKey(str.charAt(1))){
                        map.get(str.charAt(1)).offer(str.substring(1));
                    }
                }
            }
        }
        return count;
    }
}