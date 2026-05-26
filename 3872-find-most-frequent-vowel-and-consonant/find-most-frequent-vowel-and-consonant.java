class Solution {
    public int maxFreqSum(String s) {
        int v[] = new int[26];
        for(char a : s.toCharArray()){
            if(a=='a' || a=='i' || a=='e' || a=='o' || a=='u'){
                v[a-'a']++;
            }
        }
        Arrays.sort(v);
        int count = v[25];
        int c[] = new int[26];
        for(char a : s.toCharArray()){
            if(a!='a' && a!='i' && a!='e' && a!='o' && a!='u'){
                c[a-'a']++;
            }
        }
        Arrays.sort(c);
        count+=c[25];
        return count;
    }
}