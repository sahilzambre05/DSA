class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char a : t.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int unique = map.size();
        int windowStart=0;
        int startIndex=-1;
        int windowEnd=0;
        int minLen = Integer.MAX_VALUE;
        int n = s.length();
        while(windowEnd<n){
            char ch = s.charAt(windowEnd);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    unique--;
                }
            }

            while(unique==0){
                int len = windowEnd-windowStart+1;
                if(minLen>len){
                    minLen=len;
                    startIndex=windowStart;
                }
                ch = s.charAt(windowStart);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                    if(map.get(ch)>0){
                        unique++;
                    }
                }
                windowStart++;
            }
            windowEnd++;
        }

        if(startIndex ==-1){
            return "";
        }
        return s.substring(startIndex,startIndex+minLen);
    }
}