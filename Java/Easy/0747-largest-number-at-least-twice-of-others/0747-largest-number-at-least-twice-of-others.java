class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        // Arrays.sort(nums);
        int max = 0;
        int indx = 0;
        for(int i = 0; i < n; i++){    
            if(nums[i] > max){
                max = Math.max(max,nums[i]);
                indx = i;
            }
            
        }
        for(int i = 0; i < n; i++){
            if(nums[i] != max){
            if(nums[i] > max/2){
                return -1;
            }
            }
        }
        return indx;
    }
}