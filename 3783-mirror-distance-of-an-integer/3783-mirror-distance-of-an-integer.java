class Solution {
    public int mirrorDistance(int n) {
        int copy = n;
        int num = 0;
        while(copy > 0){
            int digit = copy % 10;
            num = num*10 + digit;
            copy = copy / 10;
        }
        int diff = (int)(n - num);
        if(diff < 0 ){
            diff = -diff;
        }
        return diff;
    }
}