class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < n-1; i++){
            if(nums[i] == nums[i+1]){
                count = nums[i];
            }

        }
        return count;
        
    }
}