class Solution {
    public int commonFactors(int a, int b) {
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int hcf=a;
        int count=0;
        for(int i=1;i<=hcf;i++){
            if(hcf%i==0){
                count++;
            }
        }
        return count;   
    }
}