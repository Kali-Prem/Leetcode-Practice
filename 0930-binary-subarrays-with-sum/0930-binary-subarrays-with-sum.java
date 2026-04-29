class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // Prefix Sum Approach
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = sum + nums[j];
                if(sum == goal){
                    count++;
                }
            }

        }
        return count;
    }
}


// Approach : - Prefix sum and Sliding windows

// Total subarrays :-  n(n+1)/2
// SubArray is the contiguous part of an array
// 

//Hint :- Fix the first index element and then compare to the goal if equal then count++ otherwise expand the element from fist index to next tilll n; then after n, we increment the first index to 1 and then 1 to n; 