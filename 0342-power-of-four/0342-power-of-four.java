class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        int copy = n;
        while(copy > 1){
            int rem = copy % 4; //gives the reaminder
            if(rem == 0){
                copy = copy / 4; //gives the quotient
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
// hum tb tk number ko divide dekr quotient se update krenge jb tk one na ho jyaega aur remainder 0 rhe.
// agar remainder hi zero nhi rhgea toh wahin pr wo false ho jayega.