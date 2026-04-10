class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        boolean[] u = new boolean[nums.length];
        f(nums, cur, res, u);
        return res;
    }
    
    void f(int[] nums, List<Integer> cur, List<List<Integer>> res, boolean[] u){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(u[i]) continue;
            
            u[i]=true;
            cur.add(nums[i]);
            
            f(nums, cur, res, u);
            
            cur.remove(cur.size()-1);
            u[i]=false;
        }
    }
}