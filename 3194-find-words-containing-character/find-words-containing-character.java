class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<words.length;j++){
            String w = words[j];
            int k=0;
            for(int i=0;i<w.length();i++){
                if(w.charAt(i)==x){
                    k++;
                }
            }
            if(k>0){
                list.add(j);
            }
        }
        return list;
    }
}