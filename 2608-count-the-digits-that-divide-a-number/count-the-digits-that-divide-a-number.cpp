class Solution {
public:
    int countDigits(int num) {
        int copy = num;
        int temp = num;
        int count = 0;
        for(int i = copy; i > 0; i = i/10){
            int digit = i % 10;
            if(num % digit == 0){
                count++;
            }
            copy = copy /10;
        }
        return count;
    }
};