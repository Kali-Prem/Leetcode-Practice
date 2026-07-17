class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        int count = 0;
        // String vowels = "aeiou";
        
        for(int i = n-1; i >= 0; i--){
            char ch = s.charAt(i);
            // if(vowels.indexOf(ch) != -1) count++;
            if(ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ){
                count++;
            }
            else break;
        }
        String x = s.substring(0, n-count);
        return x;
    }
}