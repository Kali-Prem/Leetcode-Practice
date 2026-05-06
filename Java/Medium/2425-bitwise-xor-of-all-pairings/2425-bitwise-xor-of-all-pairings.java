class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int xor = 0;
        if(n % 2 != 0){
            for(int i = 0; i<m; i++){
                xor = xor^ nums2[i];
            }
        }
        if(m % 2 != 0){
            for(int i = 0; i < n; i++){
                xor = xor ^ nums1[i];
            }
        }
        return xor;

       
        // ======Time limit Exceed======
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j <m; j++){
        //         xor = xor^(nums2[j]^nums1[i]);
        //     }
        // }
        // return xor;

    }
}

// num1 agar odd rhega toh num2 ke element ka sirf xor nikalenge 
// num2 agar odd rhgea toh hum num1 ke element ka sirf xor nikalengr kyunki even agar num1 rhgea toh num2 even times rhgea jiske karan wo xor me zero ho jayega

// Note: even times xor will be zero and odd times will be number itself;