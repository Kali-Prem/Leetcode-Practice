class Solution {
    public long sumAndMultiply(int n) {
        // int temp = n;
        int sum = 0;
        int temp = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            if(digit != 0){
                temp = temp * 10 + digit;
            }
            n = n / 10;
        }
        int x = 0;
        while(temp > 0){
            x = x * 10 + temp%10;
            temp = temp / 10;
        }
        return (long)x*sum;

    }
}