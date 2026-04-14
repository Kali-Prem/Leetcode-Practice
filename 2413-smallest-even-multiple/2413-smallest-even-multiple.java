class Solution {
    public int smallestEvenMultiple(int n) {
        int num = 0;
        for(int i = n; i >= n; i++ ){
            if(i % n == 0 && i % 2 == 0){
                num = i;
                break;
            }
        }
        return num;
    }
}