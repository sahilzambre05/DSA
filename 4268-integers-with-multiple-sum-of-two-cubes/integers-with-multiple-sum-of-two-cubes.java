class Solution {
    public List<Integer> findGoodIntegers(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int limit = (int)Math.cbrt(n);
        for(int i=1;i<=limit;i++){
            for(int j=i;j<=limit;j++){
                int prod = i*i*i+j*j*j;
                if(prod>n){
                    break;
                }
                map.put(prod,map.getOrDefault(prod,0)+1);
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int x : map.keySet()){
            if(map.get(x)>=2){
                res.add(x);
            }
        }
        Collections.sort(res);
        return res;
    }
}