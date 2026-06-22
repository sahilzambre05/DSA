class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> res = new ArrayList<String>();
        solve(digits,0,"",res,map);
        return res;
    }

    public void solve(String digits,int idx,String s,List<String> res,HashMap<Character,String> map){
        if(idx==digits.length()){
            res.add(s);
            return;
        }
        String curr = map.get(digits.charAt(idx));
        for(int i=0;i<curr.length();i++){
            s+=curr.charAt(i);
            solve(digits,idx+1,s,res,map);
            s = s.substring(0,s.length()-1);
        }
    }
}