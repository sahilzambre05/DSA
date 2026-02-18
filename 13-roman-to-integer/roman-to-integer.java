class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=0;
        int i,j;

        char[] in = s.toCharArray();

        for(i=0,j=1;j<in.length;i++,j++){
            if(map.get(in[i])>=map.get(in[j])){
                result+=map.get(in[i]);
            }else{
                result-=map.get(in[i]);
            }
        }

        result+=map.get(in[i]);
        return result;

        
    }
}