class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        int k = reverse(rev,x);
        if(x < 0) return false;
        if(k == temp){
            return true;
        }
        else return false;
    }
    public static int reverse(int rev, int x){
        if(x == 0) return rev;
        return reverse(rev*10+x%10, x/10);
    }
}