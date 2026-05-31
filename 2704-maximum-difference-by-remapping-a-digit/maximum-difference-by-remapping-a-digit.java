class Solution {
    public int minMaxDifference(int num) {
        String a = String.valueOf(num);
        String b = a;
        int n = a.length();
        for(int i=0;i<n;i++){
            if(a.charAt(i)!='9'){
                a = a.replace(a.charAt(i),'9');
                break;
            }
        }
        int max = Integer.parseInt(a);
        for(int i=0;i<n;i++){
            if(b.charAt(i)!='0'){
                b = b.replace(b.charAt(i),'0');
                break;
            }
        }
        int min = Integer.parseInt(b);
        return max-min;

        
    }
}