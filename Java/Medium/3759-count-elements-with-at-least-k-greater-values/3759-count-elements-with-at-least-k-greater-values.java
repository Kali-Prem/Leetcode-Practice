class Solution {
    public int countElements(int[] nums, int k) {
        if(k == 0) return nums.length;
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < n-k; i++){
            if(nums[i] < nums[n-k]){
                count++;
            }
        }     
        return count;
    }
}

// Note:- kitne element hai arra me jo k element se chhote hen 