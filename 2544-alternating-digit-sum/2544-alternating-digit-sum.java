class Solution {
    public int alternateDigitSum(int n) {
        int copy = n;
        int temp = n;
        int count = 0;
        int count1 = 0;
        int sum = 0;

        //count the digit and if the totatl diigit will even then first digit take negative sign
        while (copy > 0) {
            count++;
            copy = copy / 10;
        }
        if (count % 2 == 0) { //when total digit is even
            while (temp > 0) {
                int digit = temp % 10; //gives last digit
                count1++;
                if (count1 == 1 || count1 % 2 != 0) { //check digit is first or at odd position
                    digit = -digit;
                } else {
                    digit = digit;
                }
                sum = sum + digit;
                temp = temp / 10;

            }

        } else { //when total digit is odd
            while (temp > 0) {
                int digit = temp % 10;
                count1++;
                if (count1 == 1 || count1 % 2 != 0) {
                    digit = digit;
                } else {
                    digit = -digit;
                }
                sum = sum + digit;
                temp = temp / 10;

            }

        }
        return sum;

    }
}