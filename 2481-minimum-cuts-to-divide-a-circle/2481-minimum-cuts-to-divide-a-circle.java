class Solution {
    public int numberOfCuts(int n) {
        if(n == 1){
            return 0;
        }
        if(n % 2 == 0){
            return n/2;
        }
        else{
            return n;
        }
    }
}

/* Note: first take an example of some number and then observe the pattern .
when n = even then cuts require is n / 2; and when n = odd then cuts are n; */