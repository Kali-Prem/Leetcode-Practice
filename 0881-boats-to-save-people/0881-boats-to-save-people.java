class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int low = 0;
        int high = n - 1;
        int count = 0;
        while(low <= high){
            if(people[low]+people[high] <= limit){
                count++;
                low++;
                high--;
            }
            // if sum greater hai limit se tb
            else{
                count++;
                high--;
                // low ko fix rkhenge kyunki aange low ko aange le jane pr uska weight aur badhega and yahan pr count++ kiya hun kyunki uss high ko ek boat se bhej denge

            }
        }
        return count;
    }
}