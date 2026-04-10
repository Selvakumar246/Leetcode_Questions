class Solution {
    public int maximumProduct(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       int c=nums[n-1]*nums[n-2]*nums[n-3];
       int d=nums[0]*nums[1]*nums[n-1];
        if(c>d) return c;
        return d;
        

    }
}