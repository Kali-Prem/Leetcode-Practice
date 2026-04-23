class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // int max = n; // given n length and so range should be from o to n;
        int expectedSum = n*(n+1)/2; //sum of n numbers from 0 will be n.(n+1)/2
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
        }
        int ans = expectedSum-sum;
        return ans;
    }
}

// Distinct dikh jaye toh Hashing ka jarur sochna
// APPROACH = 2 approach,
// best approach 1). Greedy