class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);

        }

        //Traversein Map
        for(int key:map.keySet()){
            if(map.get(key) > n/2){
                return key; //always execute
            }
        }
        return -1;
        
    }
}

// T.C = O(N)
// S.C = O(SIZE OF hASHMAP)