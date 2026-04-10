class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
          List<List<int[]>> g = new ArrayList<>();
        for(int i=0;i<=n;i++) g.add(new ArrayList<>());
        
        for(int[] t : times){
            g.get(t[0]).add(new int[]{t[1], t[2]});
        }
        
        int[] d = new int[n+1];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[k] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{k, 0});
        
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int u = cur[0], w = cur[1];
            
            if(w > d[u]) continue;
            
            for(int[] nei : g.get(u)){
                int v = nei[0], wt = nei[1];
                
                if(d[v] > w + wt){
                    d[v] = w + wt;
                    pq.add(new int[]{v, d[v]});
                }
            }
        }
        
        int ans = 0;
        for(int i=1;i<=n;i++){
            if(d[i]==Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, d[i]);
        }
        
        return ans;
    }
}