class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                temp[j] = 0;
                j++;
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                temp[j] = 1;
                j++;
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] == 2){
                temp[j] = 2;
                j++;
            }
        }
        for(int i = 0; i < n; i++){
            nums[i] = temp[i];
        }
    }
}