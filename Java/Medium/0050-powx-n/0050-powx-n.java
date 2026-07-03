class Solution {
    public double myPow(double x, int n) {
        return solve(x, (long) n); // n = -31
    }
    public double solve(double x, long n){
        //Base case
        if(n == 0) return 1;
        //when n  will be negative
        if(n < 0){   //when n will be negative then we will make x to 1/x and n to negative n;
            return solve(1/x, -n);
        }
        // when n will be even
        if(n % 2 == 0){
            return solve(x*x, n/2);
        }
        else{
            return x*solve(x*x, (n-1)/2);
        }
    }
}