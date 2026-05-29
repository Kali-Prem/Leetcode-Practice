class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int low = 0;
        int high = n - 1;
        int ptr = ans.length - 1;
        while (low <= high) {
            int first = nums[low] * nums[low];
            int last = nums[high] * nums[high];
            if (first > last) {
                ans[ptr] = first;
                low++;
            } else {
                ans[ptr] = last;
                high--;
            }
            ptr--;
        }
        return ans;
    }
}
