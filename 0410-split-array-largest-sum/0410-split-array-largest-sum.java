class Solution {
    public int splitArray(int[] nums, int k) {
                int l = 0, r = 0;
        
        for(int x : nums){
            l = Math.max(l, x);
            r += x;
        }
        
        while(l < r){
            int m = l + (r - l) / 2;
            
            if(ok(nums, k, m)) r = m;
            else l = m + 1;
        }
        
        return l;
    }
    
    boolean ok(int[] nums, int k, int m){
        int c = 1, s = 0;
        
        for(int x : nums){
            if(s + x > m){
                c++;
                s = x;
            } else {
                s += x;
            }
        }
        
        return c <= k;

    }
}