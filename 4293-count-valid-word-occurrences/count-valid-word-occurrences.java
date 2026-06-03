class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        String s = "";
        for(String a : chunks){
            s+=a;
        }
        int n = s.length();
        HashMap<String,Integer> map = new HashMap<>();
        int i=0;
        while(i<n){

            if(s.charAt(i)==' '|| s.charAt(i)=='-'){
                i++;
                continue;
            }

            int j=i;
            while(j<n){
                char c = s.charAt(j);
                if(c==' ') break;

                if(c=='-'){
                    if(j+1>=n || s.charAt(j+1)==' ' || s.charAt(j+1)=='-'){
                        break;
                    }

                }

                j++;
                
            }

            String word = s.substring(i,j);
            map.put(word,map.getOrDefault(word,0)+1);
            i=j;

        }

        int ans[] = new int[queries.length];
        for(int k=0;k<queries.length;k++){
            ans[k] = map.getOrDefault(queries[k],0);
        }
        return ans;
    }
}