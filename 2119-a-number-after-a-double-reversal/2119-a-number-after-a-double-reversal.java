class Solution {
    public boolean isSameAfterReversals(int num) {
        int copy = num;
        int temp = num;
        int rev1 = 0;
        int rev2 = 0;
        if(num == 0 ) return true;
        if(copy % 10 == 0) return false;
        else{
            while(copy > 0 ){
                int digit = copy % 10;
                rev1 = rev1*10 + digit;
                copy = copy / 10;
            }
            //after this loop copy gets destroyed
            while(rev1 > 0){
                int d = rev1 % 10;
                rev2 = rev2*10 + d;
                rev1 = rev1/10;
            }
        }
        if(rev2 == temp){
            return true;
        }
        else{
            return false;
        }
    }
}