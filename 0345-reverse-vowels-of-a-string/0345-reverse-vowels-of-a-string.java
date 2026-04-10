class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){  
            while(left<right && !isvowel(arr[left]))
            left++;
            while(left<right && !isvowel(arr[right]))
            right--;
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr); 
         }        


 public boolean isvowel(char ch){
    return "AEIOUaeiou".indexOf(ch)!=-1;
 }
    }
