class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                int count = 0;
                for(int j = i+1; j < n; j++){
                    if(nums[j] % 2 != 0){
                        count++;
                    }
                    
                }
                res[i] = count;
            }
            else{
                int count = 0;
                for(int j = i; j < n; j++){
                    if(nums[j] % 2 == 0){
                        count++;
                    }
                }
                res[i] = count;
            }
        } 
        return res;
               
    }
    // public int countParity(int x, int)
}
// if nuber is even then check kro uske aange kitne odd hai , agar number odd hai toh check kro uske aange kitne even.
// T.C = O(N*N) AND S.C = O(N)