class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int sum = 0;
            int copy = nums[i];
            while(copy > 0){
                int digit = copy % 10;
                sum = sum + digit;
                copy = copy / 10;
            }
            if(sum == i){
                return i;
            }
            
        }
        return -1;
    }
}