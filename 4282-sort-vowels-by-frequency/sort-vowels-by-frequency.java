class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        HashMap<Character,Integer> freq = new HashMap<>();
        HashMap<Character,Integer> first = new HashMap<>();
        List<Character> vowel = new ArrayList<>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                vowel.add(ch);
                freq.put(ch,freq.getOrDefault(ch,0)+1);
                first.putIfAbsent(ch , i);
            }
        }

        Collections.sort(vowel,(a,b)->{
            if(!freq.get(a).equals(freq.get(b))){
                return freq.get(b) - freq.get(a);
            }
            return first.get(a) - first.get(b);
        });


        StringBuilder res = new StringBuilder(s);
        int idx=0;

        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i))){
                res.setCharAt(i,vowel.get(idx++));
            }

        }
        return res.toString();
    }

    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}