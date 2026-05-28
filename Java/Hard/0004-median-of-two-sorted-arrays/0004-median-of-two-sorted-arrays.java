class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int mergedArray[] = new int[m + n];
        int j = 0;
        // copy nums1 in mergedArray
        for (int i = 0; i < m; i++) {
            mergedArray[i] = nums1[i];
        }
        // copy nums2
        for (int i = 0; i < n; i++) {
            mergedArray[m + i] = nums2[i];
        }
        Arrays.sort(mergedArray);
        // Even Numbers
        if ((m + n) % 2 == 0) {
            int mid = (m + n) / 2;
            double result = (mergedArray[mid] + mergedArray[mid - 1]) / 2.0;
            return result;
        }
        // Odd numbers
        else {
            int mid = (m + n) / 2;
            double result = mergedArray[mid];
            return result;
        }
    }
}

// Note:- 
// (a + b) / 2
// → both are integers
// → Java performs integer division
// → decimal part gets removed.

// (a + b) / 2.0
// → one value is double (2.0)
// → Java converts whole expression into double division
// → correct decimal result comes.

// example:
// int a = 1;
// int b = 2;

// System.out.println((a + b) / 2);    // Output: 1
// System.out.println((a + b) / 2.0);  // Output: 1.5