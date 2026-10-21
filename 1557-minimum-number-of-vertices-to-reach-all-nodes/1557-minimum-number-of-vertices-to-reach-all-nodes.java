import java.util.*;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] inDeg = new int[n];

        for (List<Integer> li : edges) {
            inDeg[li.get(1)]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (inDeg[i] == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
