class Solution {
    public int numSplits(String s) {
        HashMap<Character,Integer> left = new HashMap<>();
        HashMap<Character,Integer> right = new HashMap<>();

        for(char a : s.toCharArray()){
            right.put(a,right.getOrDefault(a,0)+1);
        }

        int cnt=0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            left.put(ch,left.getOrDefault(ch,0)+1);

            right.put(ch,right.getOrDefault(ch,0)-1);

            if(right.get(ch)<=0){
                right.remove(ch);
            }

            if(left.size()==right.size()){
                cnt++;
            }
        }
        return cnt;
    }
}