class EventManager {
    PriorityQueue<int[]> pq;
    HashMap<Integer,Integer> map;
    public EventManager(int[][] events) {
        pq = new PriorityQueue<>((a,b)->{
            if(a[0] != b[0]) return b[0] - a[0];
            return a[1] - b[1];
        });
        map = new HashMap<>();

        for(int[] e : events){
            int id = e[0];
            int pr = e[1];
            map.put(id,pr);
            pq.offer(new int[]{pr,id});
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId,newPriority);
        pq.offer(new int[]{newPriority,eventId});
        
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[] top = pq.poll();
            int pr = top[0];
            int id = top[1];
            if(map.containsKey(id) && map.get(id)==pr){
                map.remove(id);
                return id;
            }
        }
        return -1;

        
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */