class Solution {
    public int subtractProductAndSum(int n) {
        int copy = n;
        int sum = 0;
        int pro = 1;
        while(copy > 0){
            int digit = copy % 10; //gives remainder means gives last digit
            sum = sum + digit;
            pro = pro*digit;
            copy = copy / 10;
        }
        int result = pro - sum;
        return result;
    }
}