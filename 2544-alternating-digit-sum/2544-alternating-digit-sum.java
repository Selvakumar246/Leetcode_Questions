class Solution {
    public int alternateDigitSum(int n) {
        String value = String.valueOf(n);
        int length = value.length();
        int sum = 0;
         for (int i = 0; i < length; i++) {
            int digit = value.charAt(i) - '0';
            if ((i + 1) % 2 == 0)
                sum -= digit;
            else
                sum += digit;
        }
        return sum;
    }
}