class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        boolean k = reverse(rev, x, x);
        if(x < 0) return false;
        if(k){
            return true;
        }
        else return false;
    }
    public static boolean reverse(int rev, int x, int temp){
        if(x == 0) return rev==temp;
        return reverse(rev*10+x%10, x/10, temp);
    }
}