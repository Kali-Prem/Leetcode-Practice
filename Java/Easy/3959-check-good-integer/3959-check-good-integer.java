class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int squareSum = 0;
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            digitSum = digitSum + digit;
            temp = temp / 10;
        }
        while(n > 0){
            int digit = n % 10; 
            squareSum = squareSum + digit*digit;
            n = n / 10;
        }
        if(squareSum-digitSum >= 50){
            return true;
        }
        return false;
    }
}