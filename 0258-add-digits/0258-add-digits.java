class Solution {
    public int addDigits(int num) {
        //approaches --> hashset, recursion
        int temp = num;

        while (temp > 9) {
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }
            temp = sum;
        }
        return temp;
    }
}