class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while(true){
            boolean merge = false;
            for(int i=0;i<sb.length();i++){
                for(int j=i+1;j<sb.length() && (j-i)<=k;j++){
                    if(sb.charAt(i)==sb.charAt(j)){
                        sb.deleteCharAt(j);
                        merge = true;
                        break;
                    }
                }
                if(merge) break;
            }
            if(!merge) break;
        }
        return sb.toString();
    }
}