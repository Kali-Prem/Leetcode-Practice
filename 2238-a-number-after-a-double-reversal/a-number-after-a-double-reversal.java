class Solution {
    public boolean isSameAfterReversals(int num) {
        int digit = 0;
        int reversed1 = 0;
        int reversed2 = 0;
        if(num < 0){
            return false;
        }
        else if(num == 0){
            return true;
        }
        else{
            for(int i = num; i>0; i = i /10){
                digit = i % 10;
                reversed1 = reversed1*10 + digit;

            }
            for(int j = reversed1; j>0; j = j / 10){
                digit = j % 10;
                reversed2 = reversed2*10 + digit;
            }
        }
        if(num == reversed2){
            return true;
        }
        else{
            return false;
        }

        
    }
}