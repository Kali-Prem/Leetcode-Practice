class Solution {
    public int numberOfCuts(int n) {
        //if n = odd then equal cuts ,if n = even then n/2 cuts if n=1 no cuts;
        if(n == 1){
            return 0;
        }
        else if(n % 2 ==0){
            return n/2;
        }
        else{
            return n;
        }
        
    }
}