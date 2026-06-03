class Solution {
    public int minFlips(String s) {
        int one=0;
        if(s.length()<3) return 0;
        for(char a : s.toCharArray()){
            if(a=='1'){
                one++;
            }
        }
        int zero = s.length()-one;
        int ans = s.length();
        ans = Math.min(ans,one);
        ans = Math.min(ans,zero);
        ans = Math.min(ans,Math.abs(one-1));
        // if(s.length()>1){
        //     int cost=0;
        //     if(s.charAt(0)=='0') cost++;
        //     if(s.charAt(s.length()-1)=='0') cost++;
        //     for(int i=1;i<s.length()-1;i++){
        //         if(s.charAt(i)=='1') cost++;
        //     }
        //     ans = Math.min(ans,cost);
        // }
        if(s.charAt(0)=='1' && s.charAt(s.length()-1)=='1'){
            ans = Math.min(ans,one-2);

        }


        return ans;

    }
}