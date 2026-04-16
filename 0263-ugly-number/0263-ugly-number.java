class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        while(n > 1){
            if(n % 2 == 0) n = n / 2;
            else if(n % 3 == 0) n = n / 3;
            else if(n % 5 == 0) n = n / 5;
            else{
                return false;
            }

        }
        return true;
    }
}


// Ugly number is that number jo sirf 2 , 3, 5 ke multiply hokr hi bna hai 
//Aur hum pehle check krenge ki ussse divisble hai ya nhi agar hai toh eska mtlb uska factor usme hai, aur factor ko hatane ke liye hum divide de denge .
/*
Let’s take:

n = 8
If you divide only once:
8 ÷ 2 = 4 → still not 1 ❌

But 8 = 2×2×2, so you need to remove all 2s, not just one.

hum jese do se divide denge to do ke sare multipy khtm ho jayega fir teen sedenge so on............. fir last me 1 bchega kyunki usme toh sirf yhi ka multiple rhgea na

*/