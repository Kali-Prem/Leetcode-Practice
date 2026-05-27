class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int temp = numBottles;
        while (numBottles >= numExchange) {
            int remBottles = numBottles % numExchange; //gives remainder
            int newBottles = numBottles / numExchange;
            sum = sum + newBottles;
            numBottles = remBottles + newBottles;
        }
        return sum;
    }
}