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

/* esme same time pr hume remainder bhi dekhna hai aur quotient bhi, agar remainder 0 hai then hum usko divide dekr quotient nikalenge and nuber ko update kr denge.
while loop me copy ko 1 se greater eseiliye rkha gya hai kyunki one tb aayega jb if condition ke ande jayega aur uss time pr mera remainder bhi 0 rhega . mtlb 3 se hum kisi numberko lgatar divide denge toh tb ek time aesa aayega jb quotiendt me 1 bch jeyega aur remainder me 0 rhega aur ye tb hoga jb wo 3 ke power ka hoga.
*/