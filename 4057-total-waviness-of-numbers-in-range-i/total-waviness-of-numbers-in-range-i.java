class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(; num1<=num2;num1++){
            String n = String.valueOf(num1);
            if(n.length()<3) ans+=0;
            for(int i=1;i<n.length()-1;i++){
                int a = n.charAt(i-1)-'0';
                int b = n.charAt(i)-'0';
                int c = n.charAt(i+1)-'0';
                if(a>b && b<c) ans+=1;
                if(a<b && c<b) ans+=1;
            }
            // num1++;

        }
        return ans;
        
    }
}