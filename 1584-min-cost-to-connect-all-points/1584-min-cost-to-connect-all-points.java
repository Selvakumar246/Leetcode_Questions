class Solution {
    public int minCostConnectPoints(int[][] p) {
        int n = p.length;
        boolean[] v = new boolean[n];
        int[] d = new int[n];
        
        for(int i = 0; i < n; i++) d[i] = Integer.MAX_VALUE;
        
        d[0] = 0;
        int c = 0;
        
        for(int i = 0; i < n; i++) {
            int u = -1;
            
            for(int j = 0; j < n; j++) {
                if(!v[j] && (u == -1 || d[j] < d[u])) u = j;
            }
            
            v[u] = true;
            c += d[u];
            
            for(int j = 0; j < n; j++) {
                int dis = Math.abs(p[u][0] - p[j][0]) + Math.abs(p[u][1] - p[j][1]);
                if(!v[j] && dis < d[j]) d[j] = dis;
            }
        }
        
        return c;
    }
}   