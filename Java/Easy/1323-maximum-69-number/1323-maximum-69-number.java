class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        } 
        int sum = 0;
        int c6 = 0;
        int rev1 = 0;
        while(rev > 0){
            int d = rev % 10;
            if(d == 6 && c6 < 1){
                d = 9;
                c6++;
            }
            rev1 = rev1 * 10 + d;
            rev = rev / 10;   
        }
        
        return rev1;
    }
}