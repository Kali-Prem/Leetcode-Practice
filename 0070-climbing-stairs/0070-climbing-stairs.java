class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int a = 2;
        int b = 3;
        int sum = 0;
        if(n == a){
            return a;
        }
        if(n == b){
            return b;
        }
        for(int i = 4; i <= n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;

    }
}
/* Note:- first recognize the pattern of any questions carefully then start coding.
here when we take the n = 2 and n =3 and n = 4 and n =5 then we show a fibonacci series which is starting from a = 2 and b = 3 and then i have started the for loop from i = 4; */