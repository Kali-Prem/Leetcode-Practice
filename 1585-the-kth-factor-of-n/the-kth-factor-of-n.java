class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;
        int result = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
            if(count == k){
                result = i;
                break;
            }
        }
        if(count == k){
            return result;
        }
        else{
            return -1;
        }
        
    }
}