class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        // put the all values in the map
        for(int ele:nums){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
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