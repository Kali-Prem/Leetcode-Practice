class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans = ans ^ nums[i];
        }
        return ans;


        // ============================
        // int n = nums.length;
        // Arrays.sort(nums);
        // // int new = nums[0];
        // for(int i = 0; i < n-1; i++){
        //     if(nums[i] != nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return 0;
    }
}
// Approach : best approach bit manupulation(xor), second - aprooach hashmap, then last is sorting