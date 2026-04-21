class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        //Traverse in array
        for (int ele : nums) {
            set.add(ele);
        }
        // Traverse in Set
        for (int i = 1; i <= n + 1; i++) {
            if (set.contains(i) == false)
                return i;
        }
        return -1;
    }
}

// T.C = o(N)+O(N)== O(N);
// S.C = O(N);
// 1 se n+1 tk dekhna hai 