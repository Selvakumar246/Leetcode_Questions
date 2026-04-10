class Solution {
    public int Binary(int[] nums,int left,int right,int target){
        if(left>right) return -1;
            int mid = (left+right)/2;
            
            if(nums[mid]==target) return mid;
            else if(target>nums[mid]) return Binary(nums,mid+1,right,target);
            return Binary(nums,left,mid-1,target);
    }
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        return Binary(nums,left,right,target);
    }  
}
