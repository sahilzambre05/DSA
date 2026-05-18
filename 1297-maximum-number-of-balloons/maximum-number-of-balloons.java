class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b'){
                b++;
            }else if(text.charAt(i)=='a'){
                a++;
            }else if(text.charAt(i)=='l'){
                l++;
            }else if(text.charAt(i)=='o'){
                o++;
            }else if(text.charAt(i)=='n'){
                n++;
            }
        }
        l/=2;o/=2;
        int ans = Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
        return ans;
    }
}