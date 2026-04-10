class Solution {
    public void merge(int[] arr, int m, int[] brr, int n) {
       int i=0,j=0,k=0;
       int cl=n+m;
       int[] crr=new int[cl];
       while(i<m && j<n){
        if(arr[i]<brr[j]){
            crr[k]=arr[i];
            i++;
            k++;
        }
        else{
            crr[k]=brr[j];
            j++;
            k++;
        }
       } 
       while(i<m){
        crr[k]=arr[i];
         i++;
         k++;
       }
       while(j<n){
        crr[k]=brr[j];
        j++;
        k++;
       }
       for(int itr=0;itr<cl;itr++){
        arr[itr]=crr[itr];
       }
    }
}