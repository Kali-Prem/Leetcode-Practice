class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == s.charAt(n - i - 1)){
                return i;
            }
        }
        return -1;
    }
}