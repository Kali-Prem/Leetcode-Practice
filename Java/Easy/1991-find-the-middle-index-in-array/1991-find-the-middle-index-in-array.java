class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        // pre
        int preSum[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
            preSum[i] = sum;
        }
        // suff
        int suffSum[] = new int[n];
        int sum1 = 0;
        for(int i = n-1; i >= 0; i--){
            sum1 = sum1 + nums[i];
            suffSum[i] = sum1;
        }
        for(int i = 0 ; i < n; i++){
            if(preSum[i] == suffSum[i]){
                return i;
            }
        }
        return -1;
    }
}