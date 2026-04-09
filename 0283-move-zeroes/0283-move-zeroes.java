class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int copy[] = new int[n]; 
        int j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                copy[j] = nums[i];
                j++;
            }
        }
        for(int i = 0; i < n; i++){
            nums[i] = copy[i];
        }
        

        
        
        
        /*=========first======
        int n = nums.length;
        int copy[] = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                copy[j] = nums[i];
                j++;
            }
        }
        //now update nums with copy 
        for(int i = 0; i < n; i++){
            nums[i] = copy[i];
        } */
    }
}

// Note:- by default , integer array declare krne pr uske sare cell me zero fill rhta hai .aur jese boolean array lene se uske sabhi cell me false rhta hai pehle se. esliey maine sirf uske non-zero ko copy wale me shift kra hai aur fir last me , uss copy wale ke last me jitne bche honge usme zero hi hoga . aur fir last me copy se sabhi ko copy kr liya nums me kyunki question me without making a copy likha hai .
// Note:- last me kcuhh bhi print krne ko nhi bola hai .