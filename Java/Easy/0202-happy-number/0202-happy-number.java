class Solution {
    public boolean isHappy(int n) {
        if(n == 1 || n == 7) return true;
        if(n < 10) return false;
        int sum = 0;
        int temp = n;
        while(temp > 0){
            int digit = temp % 10;
            sum = sum + digit*digit;
            temp = temp / 10;
        }
        return isHappy(sum);
    
    }
}