class Solution {
    public boolean isBipartite(int[][] graph) {
          int n = graph.length;
        int[] c = new int[n];
        
        for(int i=0;i<n;i++){
            if(c[i]==0){
                if(!f(i, graph, c, 1)) return false;
            }
        }
        
        return true;
    }
    
    boolean f(int i, int[][] graph, int[] c, int col){
        c[i] = col;
        
        for(int n : graph[i]){
            if(c[n]==0){
                if(!f(n, graph, c, -col)) return false;
            }
            else if(c[n]==col){
                return false;
            }
        }
        
        return true;
    }
}