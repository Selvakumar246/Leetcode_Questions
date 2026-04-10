class Solution {
    public String finalString(String s) {
        char [] str=new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                for(int k=0; k<j/2; k++){
                    char temp=str[k];
                    str[k]=str[j-k-1];
                    str[j-k-1]=temp;
                }
            }
            else{
               str[j]=s.charAt(i);
                j++;
            }
        }
        return new String(str,0,j);
    }
}