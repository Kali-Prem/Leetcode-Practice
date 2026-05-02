class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        // put the all values in the map
        for(int i = 0; i<n; i++){
            int x = nums[i];
            if(hm.containsKey(x)){
                hm.put(x,hm.getOrDefault(x,0)+1);
            }
            else{
                hm.put(x,1);
            }
        }
        List<Integer> result = new ArrayList<>();
        // CHecking the leement
        for(int k:hm.keySet()){
            if(hm.get(k) > n/3){
                result.add(k);
            }
        }
        return result;


    }
}