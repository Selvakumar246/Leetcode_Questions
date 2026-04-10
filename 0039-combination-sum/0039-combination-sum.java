class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        f(0, candidates, target, cur, res);
        return res;
    }
    
    void f(int i, int[] candidates, int target, List<Integer> cur, List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        if(i==candidates.length || target<0) return;
        
        cur.add(candidates[i]);
        f(i, candidates, target - candidates[i], cur, res);
        cur.remove(cur.size()-1);
        
        f(i+1, candidates, target, cur, res);
    }
}