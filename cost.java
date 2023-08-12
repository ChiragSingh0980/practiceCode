class Pair implements Comparable<Pair> {
    int v;
    int wt;

    Pair(int v, int wt) {
        this.v = v;
        this.wt = wt;
    }
    // we are comparing pq elements with the weight we have assigned to it
    public int compareTo(Pair that) {
        return this.wt - that.wt;
    }
}
class Solution {
    public int minCostConnectPoints(int[][] points) {
        List<List<Pair>> ls = new ArrayList<>(points.length);
        for(int i = 0; i < points.length; i++){
            ls.add(new ArrayList<Pair>());
        }
        for(int i = 0; i < points.length; i++){
            for(int j = i+1; j < points.length; j++){
                int x1 = points[i][0];
                int x2 = points[j][0];
                int y1 = points[i][1];
                int y2 = points[j][1];
                int dist = (int)((int)Math.abs(x1 - x2) + (int)Math.abs(y1 - y2));
                ls.get(i).add(new Pair(j, dist));
                ls.get(j).add(new Pair(i, dist));
            }
        }
        return prims(ls, points.length);
    }
    int prims(List<List<Pair>> ls, int n){
        PriorityQueue<Pair> pq = new PriorityQueue();
        pq.offer(new Pair(0, 0));
        List<Boolean> bool = new ArrayList<Boolean>(n);
        for (int i = 0; i < n; i++) {
            bool.add(false);
        }
        int sum = 0;
        
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            int wt = pair.v;
            int value = pair.wt;
            if(bool.get(wt) == true) continue;
            
            bool.set(wt, true);
            sum += value;
            
            for(Pair p : ls.get(wt)){
                int neighbor = p.v;
                int neighborWt = p.wt;
                
                if(bool.get(neighbor) == false){
                    pq.offer(new Pair(neighbor, neighborWt));
                }
            }
        }
        return sum;
    }
}