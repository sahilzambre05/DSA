class Solution {
    public boolean checkInclusion(String p, String s) {
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        // List<Integer> list = new ArrayList<>();

        // if(s.length()<p.length()){
        //     return list;
        // }

        for(char a : p.toCharArray()){
            pCount[a-'a']++;
        }

        for(int i=0;i<s.length();i++){
            sCount[s.charAt(i)-'a']++;

            if(i>=p.length()){
                sCount[s.charAt(i-p.length())-'a']--;
            }

            if(Arrays.equals(sCount,pCount)){
                return true;
            }
        }
        return false;
        
    }
}