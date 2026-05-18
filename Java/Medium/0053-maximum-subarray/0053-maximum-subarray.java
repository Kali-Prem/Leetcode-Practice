class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <  n; i ++){
            currSum = currSum + nums[i]; 
            maxSum = Math.max(maxSum,currSum);
            
            if(currSum < 0){         //when currSum will be negative
                currSum = 0;
            }

        }
        return maxSum;

        
    }
}
// Approach: 1.Bruteforce appoarch--> using nested loops which make all the subarray but the T.C Will be 0(n^2)
//            2. Using Kadane's Algorithm--> make the currSUm 0 if the current sum comes -ve;  