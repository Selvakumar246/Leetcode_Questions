class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int start=0;
        int end=0;
        for(end=0;end<nums.length;end++){
            if(set.contains(nums[end])) return true;
            
            set.add(nums[end]);
            if(end-start>=k){
                set.remove(nums[start]);
                start++;
            }
        }
        return false;
}
}