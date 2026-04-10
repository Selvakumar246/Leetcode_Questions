class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> g = new ArrayList<>();
        for(int i=0;i<numCourses;i++) g.add(new ArrayList<>());
        
        for(int[] p : prerequisites){
            g.get(p[1]).add(p[0]);
        }
        
        int[] v = new int[numCourses];
        
        for(int i=0;i<numCourses;i++){
            if(v[i]==0){
                if(!f(i, g, v)) return false;
            }
        }
        
        return true;
    }
    
    boolean f(int i, List<List<Integer>> g, int[] v){
        if(v[i]==1) return false;
        if(v[i]==2) return true;
        
        v[i]=1;
        
        for(int n : g.get(i)){
            if(!f(n, g, v)) return false;
        }
        
        v[i]=2;
        return true;
    }
}