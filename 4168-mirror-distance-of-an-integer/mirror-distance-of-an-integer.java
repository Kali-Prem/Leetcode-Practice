class Solution {
    public int mirrorDistance(int n) {
        int copy = n;
        int digit = 0;
        int rev = 0;
        while(n>0){
            digit = n % 10;
            rev = rev*10+digit;
            n = n/10;
        }
        int mirror = copy - rev;
        if(mirror<0){
            mirror = -mirror;
        }
        return mirror;

        
    }
}