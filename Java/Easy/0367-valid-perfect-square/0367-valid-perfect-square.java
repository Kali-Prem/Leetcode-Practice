class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 0;
        long high = num;
        while(low <= high){
            long mid = low + (high-low)/2;
            long sqr = mid*mid;
            if(sqr == (long)num){
                return true;
            }
            else if(sqr > (long)num){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
        
    }
}