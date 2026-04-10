class Solution {
    public int countDigits(int num) {
        int count=0;
        int original=num;
      while(num>0){
       int rem=num%10;
        if(original%rem==0 && rem!=0)
        count++;
        num/=10;
      }
      return count;   
    }
}