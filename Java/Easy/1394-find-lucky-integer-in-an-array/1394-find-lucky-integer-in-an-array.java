class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int luck = -1;
        for(int key:map.keySet()){
            if(key == map.get(key)){
                luck = Math.max(luck,key);
            }
        }
        return luck;
    }
}