class Solution {
    public int digitFrequencyScore(int n) {
        // int l = n.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            int x = n % 10;
            map.put(x, map.getOrDefault(x, 0) + 1);
            n = n / 10;
        }
        int sum = 0;
        for (int key : map.keySet()) {
            int val = map.get(key);
            sum = sum + (val * key);
        }
        return sum;
    }
}