class Solution {
    public int[] scoreValidator(String[] events) {
        int[] res = new int[2];
        int s=0;
        int c=0;
        for(int i=0;i<events.length;i++){
            if(c>=10){
                break;
            }
            if(events[i].equals("W")){
                c++;
            }else if(events[i].equals("WD")){
                s++;
            }else if(events[i].equals("NB")){
                s++;
            }else{
                s+=Integer.parseInt(events[i]);
            }

        }
        res[0] = s;
        res[1] = c;
        return res;
        
    }
}