class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] values=new int[26];
        for(int i=0;i<sentence.length();i++){
            char c=sentence.charAt(i);
            values[c-'a']++;
        }
        for(int count:values){
            if(count==0)
            return false;
        }
        return true;
        }
}