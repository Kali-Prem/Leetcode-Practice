class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxA = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum =sum + gain[i];
            maxA = Math.max(maxA, sum);
        }
        return maxA;
        
    }
}

// hrr baar value add kro and max ko update kro agar greater hua tb
// this is also a question of prefix sum