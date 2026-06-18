class Solution {
    public boolean containsDuplicate(int[] nums) {
     HashSet <Integer> set=new HashSet<>();
     for(int arr:nums){
        if(set.contains(arr))
        return true;
        else
         set.add(arr);
     }
     return false;
      
    }
}