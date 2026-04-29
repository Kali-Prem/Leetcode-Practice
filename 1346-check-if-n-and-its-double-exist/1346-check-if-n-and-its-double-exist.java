class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        HashSet <Integer> set = new HashSet<>();

        for(int ele:arr){
            if(set.contains(2*ele)){
                return true;
            }
            if(ele % 2 == 0 && set.contains(ele/2)){
                return true;
            }
            set.add(ele);
        }
        return false;
        
    }
}
// aange present hoga toh  multiple krke check krenge aur agar pichhe walr ko check krkne ke liye hum aagne wale pr divide kkr echeck krenge