class Solution {
    public int alternateDigitSum(int n) {
        int temp = n;
        int copy = n;
        int count = 0;
        int count1 = 0;
        int sum = 0;
        while(temp > 0){
            count++;
            temp = temp / 10;
        }

        if(count % 2 == 0){  //if count is even then first ko negative
            while(copy > 0){
                int digit = copy % 10;
                count1++;
                if(count1 == 1 || count1 % 2 != 0 ){
                    digit = -digit;
                }
                else{
                    digit = digit;
                }
                sum = sum + digit; 

                copy = copy / 10;
            }
        }
        else{                // first digit ko add rkho
            while(copy > 0){
                int digit = copy % 10;
                count1++;
                if(count1 == 1 || count1 % 2 != 0 ){
                    digit = digit;
                }
                else{
                    digit = -digit;
                }
                sum = sum + digit; 

                copy = copy / 10;
            }
        }
        return sum;
        
    }
}