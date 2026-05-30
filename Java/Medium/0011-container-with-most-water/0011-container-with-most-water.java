class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int low = 0;
        int high = n - 1;
        int maxCapacity = 0;
        while(low < high){
            int h = Math.min(height[low],height[high]);
            int w = high-low;
            int currCapacity = h * w;
            maxCapacity = Math.max(maxCapacity,currCapacity);
            // To get max height;
            if(height[low] < height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return maxCapacity; 
    }
}