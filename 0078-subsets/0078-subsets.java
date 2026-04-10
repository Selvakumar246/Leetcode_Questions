class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        f(0, nums, cur, res);
        return res;
    }
    
    void f(int i, int[] nums, List<Integer> cur, List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        
        f(i+1, nums, cur, res);
        
        cur.add(nums[i]);
        f(i+1, nums, cur, res);
        cur.remove(cur.size()-1);
  
    }
}