class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max,nums[i]);
        }
        for(int i = 0; i < n; i++){
            if(max == nums[i]){
                return i;
            }
        }
        return -1;
    }
}


//note: approach:- linear search, binary search
// note: - ek array me ek se jyada peak element ho skta hai . 
// note:- t.c in linear search O(n) and t.c in binary search - O(logn);
// 