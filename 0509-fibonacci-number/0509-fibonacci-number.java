class Solution {
    public int fib(int n) {
        int i=0,j=1;
        for(int k=1;k<=n;k++){
            int next=i+j;
            i=j;
            j=next;
        }
        return i;
    }
}