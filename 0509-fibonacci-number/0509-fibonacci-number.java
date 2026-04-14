class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 2; i <= n;i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}

/* NOte: value esme 0 and 1 se start hoga.
            esem hame previos ke do number ks sum chahiye hota hai.
            esme hum assume krenge ki indexing 0 se start hoti hai.

   Note: - hum first ko a and second ko b maan lete hen and next ko hum sum mante hen. esiliye jb for loop me iteration ko hum 2 se start krte hen tb hume actually me 3 index ka number mil jata hai .
   esliye hum a ko b aur b ko sum assign krete jayege 

*/ 