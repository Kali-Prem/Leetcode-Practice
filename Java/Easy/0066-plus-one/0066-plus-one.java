class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits; // ye line always
            }
            else{
                digits[i] = 0;
            }
        }
        // below line only execute when array consist only 9
        int res[] = new int[n+1];
        res[0] = 1;
        return res;
    }
}