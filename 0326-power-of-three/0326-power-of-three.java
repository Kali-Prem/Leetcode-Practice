class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        int copy = n;
        // int rem = 0;
        while(copy > 1){
            int rem = copy % 3; //gives remainder
            if(rem == 0){
                copy = copy / 3; //gives quotient for next divide
            }
            else{
                return false;
            }
        }
        return true;
    }
}