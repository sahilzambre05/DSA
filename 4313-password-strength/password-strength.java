class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<Character>();
        for(char s : password.toCharArray()){
            set.add(s);
        }
        int ans=0;

        for(char c : set){
            if(Character.isLowerCase(c)){
                ans+=1;
            }else if(Character.isUpperCase(c)){
                ans+=2;
            }else if(Character.isDigit(c)){
                ans+=3;
            }else{
                ans+=5;
            }
        }
        return ans;
    }
}