class Solution {
    public String toHex(int num) {
    if(num==0) return "0";
    char[] letters="0123456789abcdefgf".toCharArray();
    StringBuilder sb=new StringBuilder();
    while(num!=0){
        sb.append(letters[num & 15]);
        num>>>=4;
    }
    return sb.reverse().toString();
    }
}