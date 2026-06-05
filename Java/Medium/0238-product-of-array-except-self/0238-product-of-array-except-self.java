class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prePro[] = new int[n];
        int suffPro[] = new int[n];
        prePro[0] = 1;
        suffPro[n - 1] = 1;
        // for prePro
        for (int i = 0; i < n - 1; i++) {
            prePro[i + 1] = nums[i] * prePro[i];
        }
        // for suffPRO
        for (int i = n - 1; i > 0; i--) {
            suffPro[i - 1] = suffPro[i] * nums[i];
        }
        // Product of both
        int pro[] = new int[n];
        for (int i = 0; i < n; i++) {
            pro[i] = prePro[i] * suffPro[i];
        }
        return pro;

    }

}

// Notes:- Topic:- [ Prefix Sum and Suffix Sum ]