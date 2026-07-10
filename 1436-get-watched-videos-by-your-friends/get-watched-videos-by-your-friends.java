class Solution {
    class Pair implements Comparable<Pair>{
        String video;
        int id;
        Pair(String video,int id){
            this.video = video;
            this.id = id;
        }

        public int compareTo(Pair that){
            if(this.id == that.id){
                return this.video.compareTo(that.video);
            }
            return this.id - that.id;
        }
    }
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(id);
        visited.add(id);
        int curlevel=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int curId = queue.poll();
                for(int friend : friends[curId]){
                    if(!visited.contains(friend)){
                        visited.add(friend);
                        queue.offer(friend);
                    }
                }
            }
            curlevel++;
            if(curlevel == level){
                break;
            }
        }
        HashMap<String,Integer> map = new HashMap<>();
        while(!queue.isEmpty()){
            int curId = queue.poll();
            for(String videos : watchedVideos.get(curId)){
                map.put(videos,map.getOrDefault(videos,0)+1);
            }
        }
        List<Pair> videosList = new ArrayList<>();
        for(String videos : map.keySet()){
            videosList.add(new Pair(videos,map.get(videos)));
        }
        Collections.sort(videosList);
        List<String> res = new ArrayList<>();
        for(Pair pair : videosList){
            res.add(pair.video);
        }
        return res;

    }
}