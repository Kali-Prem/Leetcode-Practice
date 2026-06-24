class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int preSum[] = new int[n];
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = sum1 + nums[i];
            preSum[i] = sum1;
        }
        //Suffix sum
        int suffSum[] = new int[n];
        int sum2 = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum2 = sum2 + nums[i];
            suffSum[i] = sum2;
        }
        //    compare
        for (int i = 0; i < n; i++) {
            if (preSum[i] == suffSum[i]) {
                return i;
            }
        }
        return -1;
    }
}