class Solution {
    public boolean isHappy(int n) {
        // int copy = n;
        int temp = n;
        if(n<0) return false;
        else{
            while(temp > 1 && temp != 4){ 
                //check also this, Because all unhappy numbers eventually reach 4. and without checking this the loops goes into the infinite loops
                int sum = 0;
                int copy = temp;
                while(copy > 0){
                    int digit = copy % 10;
                    sum = sum + digit*digit;
                     copy = copy / 10;
                }
                temp = sum;
            }

        }
        if(temp == 1) return true;
        else return false;
    }
}
